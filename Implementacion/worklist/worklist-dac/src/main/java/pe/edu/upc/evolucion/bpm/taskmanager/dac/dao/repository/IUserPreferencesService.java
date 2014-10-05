package pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository;

import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.UserPreference;

/**
 *
 * @author USUARIO
 */
public interface IUserPreferencesService {
    UserPreference findUserByLogin(String login) throws DaoRepositoryException;
    public void saveUserPreferences(UserPreference preferences) throws DaoRepositoryException;
}
