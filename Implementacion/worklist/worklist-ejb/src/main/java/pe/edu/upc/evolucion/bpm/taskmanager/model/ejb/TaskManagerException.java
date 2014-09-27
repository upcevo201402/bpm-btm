package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import java.rmi.RemoteException;

/**
 *
 * @author USUARIO
 */
public class TaskManagerException extends RemoteException {    
    public TaskManagerException() {
        super();
    }

    public TaskManagerException(String message) {
        super(message);
    }

    public TaskManagerException(String message, Exception ex) {
        super(message, ex);
    }    
    
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
