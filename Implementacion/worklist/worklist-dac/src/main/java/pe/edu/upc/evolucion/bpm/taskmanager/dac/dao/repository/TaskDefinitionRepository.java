package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.BaseDao;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskDefinition;

/**
 *
 * @author USUARIO
 */
@Repository("taskDefinition")
@Transactional
public class TaskDefinitionRepository implements ITaskDefinitionRepository {
    private Logger log = Logger.getLogger(TaskInstancesRepository.class.getName());

    @Autowired
    private BaseDao<String, TaskDefinition> dao;
    
    @Override
    public String createTaskDefinition(TaskDefinition taskDef) throws DaoRepositoryException {
        try {
            taskDef.setId(UUID.randomUUID().toString());
            dao.insert(taskDef);
            return taskDef.getId();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("createTaskDefinition", ex.getMessage());
        }
    }    

    @Override
    public List<TaskDefinition> getTasksDefinition() throws DaoRepositoryException {
        try {
            List<TaskDefinition> taskDefinitions = dao.findByNamedQuery("TaskDefinition.findAll");
            return taskDefinitions;
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new  DaoRepositoryException("TaskDefinition.findAll", ex.getMessage());
        }
    }

    @Override
    public TaskDefinition getTaskDefinition(String taskDefinitionId) throws DaoRepositoryException {
        try {
            TaskDefinition taskDef = dao.findByKey(taskDefinitionId, TaskDefinition.class);
            return taskDef;
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("getTaskDefinition", ex.getMessage());
        }
    }
}
