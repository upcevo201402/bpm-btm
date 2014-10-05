package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

@Component("baseDao")
public class BaseDaoImpl<K, T> implements BaseDao<K, T> {

    private static final Logger logger = LoggerFactory.getLogger(BaseDaoImpl.class);
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(T obj) throws SQLException {
        logger.info("Creando nuevo {0}", obj.getClass().getName());
        em.persist(obj);
    }

    @Override
    public void update(T obj) throws SQLException {
        logger.info("Actualizando a {0}", obj.getClass().getName());
        em.merge(obj);
    }

    @Override
    public T findByKey(K key, Class<T> type) throws SQLException {
        logger.info("Buscando por llave a {0}", type.getClass().getName());
        return em.find(type, key);
    }

    @Override
    public void delete(T obj) throws SQLException {
        logger.info("Eliminando a s{0}", obj.getClass().getName());
        em.remove(em.getReference(obj.getClass(), obj));
    }

    @Override
    public List<T> findByNamedQuery(String namedQueryName) throws SQLException {
        logger.info("Buscando por Query nombrado {0}", namedQueryName);
        Query q = em.createNamedQuery(namedQueryName);
        return q.getResultList();
    }

    @Override
    public List<T> findByNamedQuery(String namedQueryName, Map<String, Object> parameters) throws SQLException {
        logger.info("Buscando por Query nombrado {0} con parametros {1}",
                new Object[]{namedQueryName, new Integer(parameters.size())});
        Query q = em.createNamedQuery(namedQueryName);
        for (String paramName : parameters.keySet()) {
            q.setParameter(paramName, parameters.get(paramName));
        }
        return q.getResultList();
    }

    @Override
    public List<T> findByNamedQuery(String namedQueryName, int resultLimit) throws SQLException {
        logger.info("Buscando por Query nombrado {0} limitada a {1}",
                new Object[]{namedQueryName, new Integer(resultLimit)});
        Query q = em.createNamedQuery(namedQueryName);
        q.setMaxResults(resultLimit);
        return q.getResultList();
    }

    @Override
    public List<T> findByNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit) throws SQLException {
        logger.info("Buscando por Query nombrado {0} limitada a {1} y con parametros {2}",
                new Object[]{namedQueryName, new Integer(resultLimit), new Integer(parameters.size())});
        Query q = em.createNamedQuery(namedQueryName);
        for (String paramName : parameters.keySet()) {
            q.setParameter(paramName, parameters.get(paramName));
        }
        q.setMaxResults(resultLimit);
        return q.getResultList();
    }
}