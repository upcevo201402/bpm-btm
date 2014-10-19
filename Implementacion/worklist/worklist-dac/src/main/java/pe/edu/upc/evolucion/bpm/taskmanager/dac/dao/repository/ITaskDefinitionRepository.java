package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskDefinition;

/**
 *
 * @author USUARIO
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
}
