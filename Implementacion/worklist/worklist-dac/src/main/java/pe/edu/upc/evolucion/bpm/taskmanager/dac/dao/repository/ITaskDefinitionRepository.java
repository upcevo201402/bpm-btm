package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.util.List;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskDefinition;

/**
 *
 * @author USUARIO/
 */
public interface ITaskDefinitionRepository {

    /**
     * Realiza el registro de una nueva definicion de tarea de negocio.
     *
     * @param tasDef
     * @return
     * @throws DaoRepositoryException
     */
    public String createTaskDefinition(TaskDefinition tasDef) throws DaoRepositoryException;

    /**
     * Permite devolver un listado de todas las definiciones de tareas que se
     * encuentran definidas.
     *
     * @return
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException
     */
    public List<TaskDefinition> getTasksDefinition() throws DaoRepositoryException;

    /**
     * 
     * @param taskDefinitionId
     * @return
     * @throws DaoRepositoryException 
     */
    TaskDefinition getTaskDefinition(String taskDefinitionId) throws DaoRepositoryException;
}
