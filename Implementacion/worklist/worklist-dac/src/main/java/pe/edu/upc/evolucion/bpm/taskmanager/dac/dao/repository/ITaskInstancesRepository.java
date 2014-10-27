package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstance;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstanceEvent;

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
     * @param userName
     * @return 
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException 
     */
    public String createTask(TaskInstance taskDef, String userName) throws DaoRepositoryException;
    /**
     * 
     * @param user
     * @param taskId
     * @return
     * @throws DaoRepositoryException 
     */

    /**
     * 
     * @param taskId
     * @return
     * @throws DaoRepositoryException 
     */
    TaskInstance getTask(String taskId) throws DaoRepositoryException;
    /**
     * 
     * @param theTask
     * @return
     * @throws DaoRepositoryException 
     */
    TaskInstance saveTask(TaskInstance theTask) throws DaoRepositoryException;

    /**
     * 
     * @param taskId
     * @return
     * @throws DaoRepositoryException 
     */
    TaskInstanceEvent getCurrentState(String taskId) throws DaoRepositoryException;
    
    /**
     * 
     * @param taskId
     * @param newState
     * @param userName
     * @throws pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException
     */
    void saveNewState(String taskId, TaskInstanceStateEnum newState, String userName, TaskOperationEnum operation) throws DaoRepositoryException;

}
