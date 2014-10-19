/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.BaseDao;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstance;

/**
 *
 * @author USUARIO
 */
@Service(value = "taskInstances")
@Transactional
public class TaskInstancesRepository implements ITaskInstancesRepository {

    private Logger log = Logger.getLogger(TaskInstancesRepository.class.getName());

    @Autowired
    private BaseDao<String, TaskInstance> dao;

    /**
     *
     * @param taskId
     * @param priority
     * @throws DaoRepositoryException
     */
    @Override
    public void setPriority(String taskId, Integer priority) throws DaoRepositoryException {
        try {
            TaskInstance theTask = dao.findByKey(taskId, TaskInstance.class);
            assert theTask != null : new DaoRepositoryException("setPriority", "Task not found");
            theTask.setPriority(priority);
            dao.update(theTask);
        } catch (SQLException ex) {
            Logger.getLogger(TaskInstancesRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String createTask(TaskInstance taskDef) throws DaoRepositoryException {
        try {
            TaskInstance theTask = new TaskInstance();
            taskDef.setId( UUID.randomUUID().toString() );
            dao.insert(theTask);
            
            return theTask.getId();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("createTask");
        }
    }

    @Override
    public void changeState(String taskId, String newState, String userName) throws DaoRepositoryException {
        try {
            TaskInstance theTask = dao.findByKey(taskId, TaskInstance.class);
            assert theTask != null : new DaoRepositoryException("setPriority", "Task not found");
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
        }
    }
}
