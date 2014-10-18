package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.BaseDao;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskStates;

/**
 *
 * @author USUARIO
 */
@Service(value = "mds")
@Transactional
public class MasterDataRepository implements IMasterDataRepository {

    private Logger log = Logger.getLogger(MasterDataRepository.class.getName());

    @Autowired
    private BaseDao<Integer, TaskStates> dao;

    @Override
    public List<TaskStates> getAllTaskStates() throws DaoRepositoryException {
        try {
            return dao.findByNamedQuery("TaskStates.findAll");
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("TaskStates.findAll");
        }
    }

    @Override
    public TaskStates getTaskStateById(Integer stateId) throws DaoRepositoryException {
        try {
            return dao.findByKey(stateId, TaskStates.class);
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("TaskStates.findByKey");
        }
    }
}
