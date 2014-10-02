package pe.edu.upc.evolucion.bpm.taskmanager.model.dto;

import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author USUARIO
 */
public interface ITaskContext extends java.io.Serializable {
    /**
     *  identity context (typically realm) of the connected user
     * @return 
     */
    String getIdentityContext();
    /**
     * denoting admin privilege of connected user
     * @return 
     */
    Boolean getIsAdmin();
    /**
     *  user's Locale
     * @return 
     */
    Locale getLocale();
    /**
     * objectId that the context is associated with
     * @return 
     */
    String getObjectId();
    
    /**
     * time the context is created
     * @return 
     */
    long getStartDateTime();
    /**
     * user's TimeZone
     * @return 
     */
    TimeZone getTimeZone();
    /**
     * token if the user is authenticated
     * @return 
     */
    String getToken();
    /**
     * user name of the connected user
     * @return 
     */
    String getUser();
}
