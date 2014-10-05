package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

/**
 *
 * @author USUARIO
 */
public class DaoRepositoryException extends Exception {
    private String namedQuery;

    public String getNamedQuery() {
        return namedQuery;
    }

    public void setNamedQuery(String namedQuery) {
        this.namedQuery = namedQuery;
    }

    public DaoRepositoryException(String namedQuery) {
        this.namedQuery = namedQuery;
    }

    public DaoRepositoryException(String namedQuery, String message) {
        super(message);
        this.namedQuery = namedQuery;
    }

    public DaoRepositoryException(String namedQuery, String message, Throwable cause) {
        super(message, cause);
        this.namedQuery = namedQuery;
    }

    public DaoRepositoryException(String namedQuery, Throwable cause) {
        super(cause);
        this.namedQuery = namedQuery;
    }

    public DaoRepositoryException(String namedQuery, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.namedQuery = namedQuery;
    }
    
}
