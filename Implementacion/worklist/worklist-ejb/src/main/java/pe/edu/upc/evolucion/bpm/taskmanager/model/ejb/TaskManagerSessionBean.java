package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

@Stateless(name = "TaskManagerSessionBean", mappedName = "ejb/TaskManagerSessionBean")
@TransactionManagement(TransactionManagementType.CONTAINER)
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class TaskManagerSessionBean implements TaskManagerSessionBeanLocal, TaskManagerSessionBeanRemote {

    final Logger logger = LoggerFactory.getLogger(TaskManagerSessionBean.class);
    //@Autowired
    //DocumentoDaoImpl dao;

    /*@Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public DocumentoDTO obtenerDocumento(String numero) throws DenunciaException {
        try {
            Documento doc = dao.buscarPorId(numero);
            DocumentoDTO dto = new DocumentoDTO(doc.getDocId(), doc.getNombre(), doc.getContenido());
            return dto;
        } catch (SQLException ex) {
            logger.error(ex.getMessage());
            throw new DenunciaException(String.format("%d - %s", ex.getErrorCode(), ex.getSQLState()));
        }
    }*/
    
}
