package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.BaseDao;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstanceEvent;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstanceState;

/**
 *
 * @author USUARIO
 */
@Service(value = "mds")
@Transactional
public class MasterDataRepository implements IMasterDataRepository {
    private static final Logger log = Logger.getLogger(MasterDataRepository.class.getName());
    
    @Autowired
    private BaseDao<Integer, TaskInstanceEvent> daoTaskEvents;
    
    @Autowired
    private BaseDao<Integer, TaskInstanceState> daoTaskStates;

    @Override
    public List<TaskInstanceState> getAllTaskStates() throws DaoRepositoryException {        
        try {
            return daoTaskStates.findByNamedQuery("TaskInstanceState.findAll");
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("TaskInstanceEvent.findAll");
        }
    }

    @Override
    public TaskInstanceEvent getTaskEventsById(Integer stateId) throws DaoRepositoryException {
        try {
            //TODO: Verificar la lógica de devolucion del estado de la tarea por Id
            return daoTaskEvents.findByKey(stateId, TaskInstanceEvent.class);
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("TaskStates.findByKey");
        }
    }
}
