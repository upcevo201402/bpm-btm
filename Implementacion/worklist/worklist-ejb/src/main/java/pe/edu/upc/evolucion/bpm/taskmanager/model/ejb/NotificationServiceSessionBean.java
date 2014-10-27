package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.NotificationResponse;

/**
 *
 * @author USUARIO
 */
@Stateless(name = "NotificationService", mappedName = "ejb/NotificationServiceSessionBean")
@TransactionManagement(TransactionManagementType.CONTAINER)
@Interceptors(SpringBeanAutowiringInterceptor.class)

public class NotificationServiceSessionBean {
    public NotificationResponse sendEmailNotification() throws NotificationServiceException {
        throw new UnsupportedOperationException("NotificationServiceSessionBean::sendEmailNotification");
    }
    public NotificationResponse sendSMSNotification() throws NotificationServiceException {
        throw new UnsupportedOperationException("NotificationServiceSessionBean::sendEmailNotification");
    }
}
