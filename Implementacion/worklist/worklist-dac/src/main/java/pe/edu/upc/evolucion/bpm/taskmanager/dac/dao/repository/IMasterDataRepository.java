package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.util.List;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstanceEvent;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstanceState;

/**
 *
 * @author USUARIO
 */
public interface IMasterDataRepository {
    /**
     * 
     * @return
     * @throws DaoRepositoryException 
     */
    List<TaskInstanceState> getAllTaskStates() throws DaoRepositoryException;
    /**
     * 
     * @param stateId
     * @return
     * @throws DaoRepositoryException 
     */
    TaskInstanceEvent getTaskEventsById(Integer stateId) throws DaoRepositoryException;
}
