package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.rmi.RemoteException;

/**
 *
 * @author USUARIO
 */
public class TaskServiceException extends RemoteException {    
    public TaskServiceException() {
        super();
    }

    public TaskServiceException(String message) {
        super(message);
    }

    public TaskServiceException(String message, Exception ex) {
        super(message, ex);
    }    
    
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
