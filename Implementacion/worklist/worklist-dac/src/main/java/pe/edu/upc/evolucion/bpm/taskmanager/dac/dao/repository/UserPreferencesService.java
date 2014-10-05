package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.BaseDao;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.UserPreference;

/**
 *
 * @author USUARIO
 */
@Service(value = "userPreferences")
@Transactional
public class UserPreferencesService implements IUserPreferencesService {
    private static final Logger log = Logger.getLogger(UserPreferencesService.class.getName());

    @Autowired
    private BaseDao<String, UserPreference> dao;
    
    @Override
    public UserPreference findUserByLogin(String login) throws DaoRepositoryException {
        try {
            return dao.findByKey(login, UserPreference.class);
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("UserPreference.findByKey");
        }
    }    

    @Override
    public void saveUserPreferences(UserPreference preferences) throws DaoRepositoryException {
        try {
            UserPreference oldPreference = dao.findByKey(preferences.getLogin(), UserPreference.class);
            
            assert (oldPreference != null) : String.format("Usuario no existe %s", preferences.getLogin());
            
            oldPreference.setAvatar(preferences.getAvatar());
            oldPreference.setNickName(preferences.getNickName());
            dao.update(oldPreference);
        } catch (SQLException ex) {
            log.log(Level.SEVERE, null, ex);
            throw new DaoRepositoryException("UserPreference.findByKey");
        } catch(AssertionError ex) {
            throw new DaoRepositoryException("UserPreference.saveUserPreferences", ex.getMessage());
        }
    }
}
