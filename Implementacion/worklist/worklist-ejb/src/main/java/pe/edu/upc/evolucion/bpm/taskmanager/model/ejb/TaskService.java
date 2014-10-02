package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.util.List;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.ITask;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.ITaskContext;

/**
 *
 * @author USUARIO
 */
public interface TaskService {
    /**
     * Acquire the task
     * @param context
     * @param taskId
     * @return 
     */
    ITask adquireTask(ITaskContext context, java.lang.String taskId);
    
    /**
     * 
     * Acquire all the tasks identified by their task id in the specified list
     * 
     * @param context
     * @param taskIds
     * @return 
     */
    Boolean adquireTasks(ITaskContext context, List<String> taskIds);
}
