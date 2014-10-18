package pe.edu.upc.evolucion.bpm.taskmanager.dac.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.IUserPreferencesRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.UserPreference;

/**
 *
 * @author USUARIO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hibernate-spring_test.xml"})
@TransactionConfiguration(defaultRollback = true)
public class UserPreferencesTest {

    @Autowired
    IUserPreferencesRepository userPreferences;

    /**
     * Verifica la existencia de un usuario previamente registrado.
     */
    @Test
    public void userExists() throws DaoRepositoryException {
        UserPreference user = userPreferences.findUserByLogin("ianache");
        assertNotNull(user);
    }

    @Test
    //@Ignore
    public void changeUserNickNameForValidUser() throws DaoRepositoryException {
        String newNickName = "demo";
        String userName = "ianache";
        UserPreference preferences = userPreferences.findUserByLogin(userName);
        assertNotNull(preferences);
        preferences.setNickName(newNickName);
        //preferences.setLogin("jperez");
        userPreferences.saveUserPreferences(preferences);
        preferences = userPreferences.findUserByLogin(userName);
        assertEquals(preferences.getNickName(), newNickName);
    }
}
