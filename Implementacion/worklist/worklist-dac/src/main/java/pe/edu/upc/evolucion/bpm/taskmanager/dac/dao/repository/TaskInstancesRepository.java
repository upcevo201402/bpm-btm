package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.BaseDao;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstance;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstanceEvent;

/**
 *
 * @author USUARIO
 */
@Service(value = "taskInstances")
@Transactional
public class TaskInstancesRepository implements ITaskInstancesRepository {

    private static final Logger log = Logger.getLogger(TaskInstancesRepository.class.getName());

    @Autowired
    private BaseDao<String, TaskInstance> daoTaskInstance;

    @Autowired
    private BaseDao<Integer, TaskInstanceEvent> daoTaskInstEvents;

    /**
     *
     * @param taskId
     * @param priority
     * @throws DaoRepositoryException
     */
    @Override
    public void setPriority(String taskId, Integer priority) throws DaoRepositoryException {
        try {
            TaskInstance theTask = daoTaskInstance.findByKey(taskId, TaskInstance.class);
            assert theTask != null : new DaoRepositoryException("setPriority", "Task not found");
            theTask.setPriority(priority);
            daoTaskInstance.update(theTask);
        } catch (SQLException ex) {
            Logger.getLogger(TaskInstancesRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String createTask(TaskInstance theTask, String userName) throws DaoRepositoryException {
        try {
            theTask.setId(UUID.randomUUID().toString());
            daoTaskInstance.update(theTask);
            saveNewState(theTask.getId(), TaskInstanceStateEnum.CREATED, userName, TaskOperationEnum.CREATE);
            return theTask.getId();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("createTask", ex);
        }
    }

    @Override
    public TaskInstance getTask(String taskId) throws DaoRepositoryException {
        try {
            TaskInstance theTask = daoTaskInstance.findByKey(taskId, TaskInstance.class);
            assert theTask != null : new DaoRepositoryException("claim", "Task not found");
            return theTask;
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("getTask", ex.getMessage());
        }
    }

    @Override
    public TaskInstance saveTask(TaskInstance theTask) throws DaoRepositoryException {
        try {
            daoTaskInstance.update(theTask);
            return theTask;
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("saveTask", ex.getMessage());
        }
    }

    @Override
    public TaskInstanceEvent getCurrentState(String taskId) throws DaoRepositoryException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("theTaskId", taskId);
        try {
            List<TaskInstanceEvent> states = daoTaskInstEvents.findByNamedQuery("TaskInstanceState.current", params);
            assert ((states != null) && (states.size() == 1)) : new DaoRepositoryException("getCurrentState", "No current state found for the task");
            return states.get(0);
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("getCurrentState", ex.getMessage());
        }
    }

    @Override
    public void saveNewState(String taskId, TaskInstanceStateEnum newState, String userName, TaskOperationEnum operation) throws DaoRepositoryException {
        try {         
            TaskInstanceEvent theEvent = new TaskInstanceEvent();
            theEvent.setTaskId(taskId);
            theEvent.setEventTime(new Date(Calendar.getInstance().getTime().getTime()));
            theEvent.setBlob(null);
            theEvent.setEventTypeId(operation.ordinal());
            theEvent.setStateId(newState.ordinal());
            theEvent.setUserName(userName);
            
            daoTaskInstEvents.update(theEvent);
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("saveNewState", ex);
        }
    }
}
