package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.ITaskInstancesRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.Task;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskContext;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskQueryClause;

/**
 *
 * @author USUARIO
 * 
 * This class provides a programmatic means for retrieving tasks, task details, etc
 * 
 */
@Stateless(name = "TaskQueryService", mappedName = "ejb/TaskQueryServiceSessionBean")
@TransactionManagement(TransactionManagementType.CONTAINER)
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TaskQueryServiceSessionBean implements TaskQueryServiceSessionBeanLocal, TaskQueryServiceSessionBeanRemote {
    @Autowired
    ITaskInstancesRepository taskInstRepository;
    
    final Logger log = LoggerFactory.getLogger(TaskQueryServiceSessionBean.class);

    /**
     * 
     * @param username
     * @param password
     * @return 
     */
    public TaskContext authenticate(String username, char [] password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

    /**
     * 
     * @param ctx
     * @param taskId
     * @param operation
     * @return 
     */
    public List<String> getAllowedAssignees(TaskContext ctx, String taskId, String operation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * 
     * @param ctx
     * @param taskId
     * @return 
     */
    public List<Task> getTaskHistory(TaskContext ctx, String taskId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * 
     * @param ctx
     * @param queryClause
     * @param startRow
     * @param endRow
     * @return 
     */
    public List<Task> queryTasks(TaskContext ctx, TaskQueryClause queryClause, Integer startRow, Integer endRow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
