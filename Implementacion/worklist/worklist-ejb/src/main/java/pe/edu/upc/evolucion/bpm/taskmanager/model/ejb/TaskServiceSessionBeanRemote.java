package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.util.List;
import javax.ejb.Remote;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.IFaultData;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.Task;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskContext;

/**
 *
 * @author USUARIO
 */
@Remote
public interface TaskServiceSessionBeanRemote {

    /**
     *
     * @param ctx
     * @param task
     * @return
     * @throws TaskServiceException
     */
    public Task createTask(TaskContext ctx, Task task) throws TaskServiceException;

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    public Task activate(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     * La tarea es reclamada para ser ejecutada por el usuario indicado en el
     * contexto de ejecución de la tarea.
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como reclamada
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public Task claim(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     * Las tareas especificadas en la lista son reclamadas para ser ejecutadas
     * por el usuario indicado en el contexto de ejecución de la tarea.
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public void batchClaim(TaskContext ctx, List<String> taskId) throws TaskServiceException;

    /**
     * La tarea es liberada para que otros participantes que pertenecen al grupo
     * de los que pueden ejecutar la tarea puedan reclamarla.
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como liberada
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public Task release(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     * La tarea se declara como finalizada pues todo lo requerido para su
     * completamiento ha sido realizado.
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como
     * completada
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public Task complete(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como iniciada
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public Task start(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como iniciada
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public Task resume(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como detenida
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public Task stop(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @param fault Información sobre la falla en la ejecución de la tarea
     * @return Se devuelve la tarea actualizada luego de marcarla como fallada
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public Task fail(TaskContext ctx, String taskId, IFaultData fault) throws TaskServiceException;

    /**
     * Replace the organizational assignment to the task in one generic human
     * role.
     *
     * @param ctx Contexto de ejecución de la tarea
     * @param taskId Identificador de la tarea
     * @param genericHumanRole
     * @param organizationalEntity
     * @throws TaskServiceException
     */
    public void setGenericHumanRole(TaskContext ctx, String taskId,
            String genericHumanRole, String organizationalEntity) throws TaskServiceException;

    /**
     * Nominate an organization entity to process the task. If it is nominated
     * to one person then the new state of thetask is Reserved. If it is
     * nominated to several people then the new state of the task is Ready.
     *
     * @param ctx
     * @param taskId
     * @param organizationalEntity
     * @throws
     * pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public void nominate(TaskContext ctx, String taskId,
            String organizationalEntity) throws TaskServiceException;

    /**
     *
     * @param taskDefinitionId
     * @param title
     * @param payload
     * @param priority
     * @param creator
     * @param ownerUser
     * @return The new created task's id
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.model.ejb.TaskServiceException
     */
    public String createTask(String taskDefinitionId, String title, String payload, 
            Integer priority, String creator, String ownerUser) throws TaskServiceException;

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    String getOutcome(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    Task getParentTask(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     * Returns the task identifier of the superior composite task of a sub task
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    String getParentTaskIdentifier(TaskContext ctx, String taskId) throws TaskServiceException;

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     * @throws TaskServiceException
     */
    Task getTaskDetails(TaskContext ctx, String taskId) throws TaskServiceException;
}
