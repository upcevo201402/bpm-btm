package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.util.List;
import javax.ejb.Local;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.Task;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskContext;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskQueryClause;

/**
 *
 * @author USUARIO
 */
@Local
public interface TaskQueryServiceSessionBeanLocal {
    /**
     * 
     * @param username
     * @param password
     * @return 
     */
    TaskContext authenticate(String username, char [] password);
    
    /**
     * 
     * @param ctx
     * @param taskId
     * @param operation
     * @return 
     */
    List<String> getAllowedAssignees(TaskContext ctx, String taskId, String operation);

    /**
     *
     * @param ctx
     * @param taskId
     * @return
     */
    List<Task> getTaskHistory(TaskContext ctx, String taskId);

    /**
     *
     * @param ctx
     * @param queryClause
     * @param startRow
     * @param endRow
     * @return
     */
    List<Task> queryTasks(TaskContext ctx, TaskQueryClause queryClause, Integer startRow, Integer endRow);
}
