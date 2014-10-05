package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author USUARIO
 */
public interface BaseDao<K, T> {

    void insert(T obj) throws SQLException;

    void update(T obj) throws SQLException;

    T findByKey(K key, Class<T> type) throws SQLException;

    void delete(T obj) throws SQLException;

    List<T> findByNamedQuery(String namedQueryName) throws SQLException;

    List<T> findByNamedQuery(String namedQueryName, Map<String, Object> parameters) throws SQLException;
    
    List<T> findByNamedQuery(String namedQueryName, int resultLimit) throws SQLException;
    
    List<T> findByNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit) throws SQLException;
}