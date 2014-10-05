/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.BaseDao;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.UserPreference;

/**
 *
 * @author USUARIO
 */
@Service(value = "taskInstances")
public class TaskInstancesService implements ITaskInstancesService {

    private Logger log = Logger.getLogger(TaskInstancesService.class.getName());

    @Autowired
    private BaseDao<String, UserPreference> dao;
    
    @Override
    public void setPriority(Integer priority) throws DaoRepositoryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
