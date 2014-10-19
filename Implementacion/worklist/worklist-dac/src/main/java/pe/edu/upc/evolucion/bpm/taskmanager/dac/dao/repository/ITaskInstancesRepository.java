package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstance;

/**
 *
 * @author USUARIO
 */
public interface ITaskInstancesRepository {
    /**
     * 
     * @param taskId
     * @param priority
     * @throws DaoRepositoryException 
     */
    void setPriority(String taskId, Integer priority) throws DaoRepositoryException;
    /**
     * 
     * @param taskDef
     * @return 
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException 
     */
    public String createTask(TaskInstance taskDef) throws DaoRepositoryException;
    /**
     * 
     * @param taskId
     * @param newState
     * @param userName 
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException 
     */
    public void changeState(String taskId, String newState, String userName) throws DaoRepositoryException;
}
