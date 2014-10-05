package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.util.List;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskStates;

/**
 *
 * @author USUARIO
 */
public interface IMasterDataService {
    List<TaskStates> getAllTaskStates() throws DaoRepositoryException;
    TaskStates getTaskStateById(Integer stateId) throws DaoRepositoryException;
}
