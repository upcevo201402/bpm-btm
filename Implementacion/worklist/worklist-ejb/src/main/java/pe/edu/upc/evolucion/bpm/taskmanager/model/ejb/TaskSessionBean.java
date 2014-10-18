package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.IFaultData;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.ITask;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.ITaskContext;

/**
 *
 * @author User
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TaskSessionBean implements ITaskSessionBeanLocal {
    @Autowired
    MDR

    public ITask claim(ITaskContext ctx, String taskId) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void batchClaim(ITaskContext ctx, List<String> taskId) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ITask release(ITaskContext ctx, String taskId) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ITask complete(ITaskContext ctx, String taskId) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ITask start(ITaskContext ctx, String taskId) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ITask resume(ITaskContext ctx, String taskId) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ITask stop(ITaskContext ctx, String taskId) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ITask fail(ITaskContext ctx, String taskId, IFaultData fault) throws TaskManagerException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }    
}
