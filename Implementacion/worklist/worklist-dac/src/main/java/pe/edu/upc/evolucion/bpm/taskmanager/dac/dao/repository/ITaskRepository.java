package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.util.List;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskDefinition;

/**
 *
 * @author User
 */
public interface ITaskRepository {
    /**
     * Se realiza la creacion de una nueva definicion de tarea a partir de la
     * que se puede realizar la creacion de instancias de la tarea.
     * 
     * @param task
     * @return 
     */
    public String createTaskDefinition(TaskDefinition task);
    /**
     * Permite devolver un listado de todas las definiciones de tareas que se
     * encuentran definidas.
     * 
     * @return 
     */
    public List<TaskDefinition> getTasksDefinition();
}
