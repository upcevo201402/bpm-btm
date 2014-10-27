package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.ITaskDefinitionRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.ITaskInstancesRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.TaskInstanceStateEnum;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.TaskOperationEnum;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskDefinition;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstance;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstanceEvent;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.IFaultData;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.Task;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskContext;

@Stateless(name = "TaskService", mappedName = "ejb/TaskServiceSessionBean")
@TransactionManagement(TransactionManagementType.CONTAINER)
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TaskServiceSessionBean implements TaskServiceSessionBeanLocal, TaskServiceSessionBeanRemote {

    final Logger log = LoggerFactory.getLogger(TaskServiceSessionBean.class);

    @Autowired
    ITaskInstancesRepository taskInstRepository;

    @Autowired
    ITaskDefinitionRepository taskDefRepository;

    /**
     *
     * @param taskDefinitionId
     * @param title
     * @param payload
     * @param priority
     * @param creator
     * @param ownerUser
     * @return
     */
    public String createTask(String taskDefinitionId, String title, String payload,
            Integer priority, String creator, String ownerUser) throws TaskServiceException {
        try {
            // Paso 1: Se verifica la existencia de la definicion de tarea
            TaskDefinition taskDef = taskDefRepository.getTaskDefinition(taskDefinitionId);
            assert taskDef != null :
                    new TaskServiceException("[createTask] No task definition was found for " + taskDefinitionId);
            // Paso 2: Se realiza la verificacion de privilegio de creacion de la instancia
            // Paso 3: Se crea la tarea
            TaskInstance theTask = new TaskInstance();
            theTask.setPriority(priority);
            theTask.setTaskDef(taskDef);
            theTask.setTitle(title);
            String taskId = taskInstRepository.createTask(theTask, ownerUser);

            // Paso 4: Se prepara el retorno            
            return taskId;
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] claim_tx_matrix = {
        {TaskInstanceStateEnum.READY, TaskInstanceStateEnum.RESERVED}
    };

    public Task claim(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.CLAIM, claim_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @throws TaskServiceException
     */
    public void batchClaim(TaskContext ctx, List<String> taskId) throws TaskServiceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] release_tx_matrix = {
        {TaskInstanceStateEnum.INPROGRESS, TaskInstanceStateEnum.READY},
        {TaskInstanceStateEnum.RESERVED, TaskInstanceStateEnum.READY}
    };

    public Task release(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.RELEASE, release_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] complete_tx_matrix = {
        {TaskInstanceStateEnum.INPROGRESS, TaskInstanceStateEnum.COMPLETED}
    };

    public Task complete(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.COMPLETE, complete_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] start_tx_matrix = {
        {TaskInstanceStateEnum.READY, TaskInstanceStateEnum.INPROGRESS},
        {TaskInstanceStateEnum.RESERVED, TaskInstanceStateEnum.INPROGRESS}
    };

    public Task start(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.START, start_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] resume_tx_matrix = {
        {TaskInstanceStateEnum.SUSPENDED, TaskInstanceStateEnum.READY},
        {TaskInstanceStateEnum.READY, TaskInstanceStateEnum.READY},
        {TaskInstanceStateEnum.SUSPENDED, TaskInstanceStateEnum.RESERVED},
        {TaskInstanceStateEnum.RESERVED, TaskInstanceStateEnum.READY},
        {TaskInstanceStateEnum.SUSPENDED, TaskInstanceStateEnum.INPROGRESS},
        {TaskInstanceStateEnum.INPROGRESS, TaskInstanceStateEnum.INPROGRESS}
    };

    public Task resume(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.RESUME, resume_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] stop_tx_matrix = {
        {TaskInstanceStateEnum.INPROGRESS, TaskInstanceStateEnum.RESERVED}
    };

    public Task stop(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.STOP, stop_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param taskId
     * @param fault
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] fail_tx_matrix = {
        {TaskInstanceStateEnum.INPROGRESS, TaskInstanceStateEnum.RESERVED}
    };

    public Task fail(TaskContext ctx, String taskId, IFaultData fault) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.FAIL, fail_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     * Activate the task, i.e. set the task to status Ready.
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] activate_tx_matrix = {
        {TaskInstanceStateEnum.CREATED, TaskInstanceStateEnum.READY}
    };

    public Task activate(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.ACTIVATE, activate_tx_matrix);
            return getTaskDetails(ctx, taskId);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     * Replace the organizational assignment to the task in one generic human
     * role.
     *
     * @param ctx
     * @param taskId
     * @param genericHumanRole
     * @param organizationalEntity
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] setgemerichumanrole_tx_matrix = {
        {TaskInstanceStateEnum.CREATED, TaskInstanceStateEnum.ANYSTATE},
        {TaskInstanceStateEnum.READY, TaskInstanceStateEnum.ANYSTATE},
        {TaskInstanceStateEnum.RESERVED, TaskInstanceStateEnum.ANYSTATE},
        {TaskInstanceStateEnum.INPROGRESS, TaskInstanceStateEnum.ANYSTATE},
        {TaskInstanceStateEnum.SUSPENDED, TaskInstanceStateEnum.ANYSTATE}
    };

    public void setGenericHumanRole(TaskContext ctx, String taskId,
            String genericHumanRole, String organizationalEntity) throws TaskServiceException {
        try {
            TaskInstanceEvent currentState = taskInstRepository.getCurrentState(taskId);
            assert currentState != null :
                    new TaskServiceException(String.format("[%s] No current state found for task: %s", "setGenericHumanRole", taskId));

            TaskInstanceStateEnum newState = checkPrecondition(currentState.getStateId(), setgemerichumanrole_tx_matrix);
            assert newState != null :
                    new TaskServiceException(String.format("[%s] Not valid current state found for task: %s", "setGenericHumanRole", taskId));

            throw new UnsupportedOperationException("Unsupported setGenericHumanRole operation");
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     * Nominate an organization entity to process the task. If it is nominated
     * to one person then the new state of the task is Reserved. If it is
     * nominated to several people then the new state of the task is Ready.
     *
     * @param ctx
     * @param taskId
     * @param organizationalEntity
     * @throws TaskServiceException
     */
    private static final TaskInstanceStateEnum[][] nominate_tx_matrix_01 = {
        {TaskInstanceStateEnum.CREATED, TaskInstanceStateEnum.READY}
    };
    private static final TaskInstanceStateEnum[][] nominate_tx_matrix_02 = {
        {TaskInstanceStateEnum.CREATED, TaskInstanceStateEnum.RESERVED}
    };

    public void nominate(TaskContext ctx, String taskId, String organizationalEntity) throws TaskServiceException {
        try {
            changeTaskState(ctx, taskId, TaskOperationEnum.NOMINATE, nominate_tx_matrix_01);
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    /**
     *
     * @param ctx
     * @param task
     * @return
     * @throws TaskServiceException
     */
    public Task createTask(TaskContext ctx, Task task) throws TaskServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the outcome of the task.
     *
     * Returns the outcome of the task. It MUST evaluate to an empty string in
     * case there is no outcome specified for the task.
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    public String getOutcome(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            TaskInstance theTask = taskInstRepository.getTask(taskId);
            assert theTask != null :
                    new TaskServiceException(String.format("[getOutcome] Task not found for id: %s", taskId));
            return theTask.getOutcome();
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }
    
    /**
     * Returns the task identifier of the superior composite task of a sub task
     * 
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException 
     */
    public String getParentTaskIdentifier(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            TaskInstance theTask = taskInstRepository.getTask(taskId);
            assert theTask != null :
                    new TaskServiceException(String.format("[getParentTaskIdentifier] Task not found for id: %s", taskId));
            return theTask.getParentTaskId();
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }
    /**
     * 
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException 
     */
    public Task getParentTask(TaskContext ctx, String taskId) throws TaskServiceException {
        String parentTaskId = getParentTaskIdentifier(ctx, taskId);
        return getTaskDetails(ctx, parentTaskId);
    }
    /**
     * 
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException 
     */
    public Task getTaskDetails(TaskContext ctx, String taskId) throws TaskServiceException {
        try {
            TaskInstance theTask = taskInstRepository.getTask(taskId);
            assert theTask != null :
                    new TaskServiceException(String.format("[getTaskDetails] Task not found for id: %s", taskId));
            Task task = new Task();
            task.setName(theTask.getTitle());
            //TODO: task.setCreatedTime(...);
            task.setPriority(theTask.getPriority());
            //TODO. task.setStatus(...);
            task.setTaskId(taskId);
            //task.setTaskType(...);
            return task;
        } catch (DaoRepositoryException ex) {
            log.error(null, ex);
            throw new TaskServiceException(ex.getMessage());
        }
    }

    private TaskInstanceStateEnum checkPrecondition(Integer currentState, TaskInstanceStateEnum[][] txMatrix) {
        for (TaskInstanceStateEnum[] targetStates : txMatrix) {
            if (targetStates[0].equals(currentState)) {
                return targetStates[1];
            }
        }
        return null;
    }

    private TaskInstanceStateEnum changeTaskState(TaskContext ctx, String taskId, TaskOperationEnum operation, TaskInstanceStateEnum[][] txMatrix) throws DaoRepositoryException {
        TaskInstance theTask = taskInstRepository.getTask(taskId);
        assert theTask != null :
                new TaskServiceException(String.format("[%s] Task not found for id: %s", operation, taskId));
        TaskInstanceEvent currentState = taskInstRepository.getCurrentState(theTask.getId());
        assert currentState != null :
                new TaskServiceException(String.format("[%s] No current state found for task: %s", operation, taskId));

        TaskInstanceStateEnum newState = checkPrecondition(currentState.getStateId(), txMatrix);
        assert newState != null :
                new TaskServiceException(String.format("[%s] Required precondition not satisfied for task: %s", operation, taskId));

        taskInstRepository.saveNewState(taskId, newState, ctx.getUser(), operation);

        return newState;
    }
}
