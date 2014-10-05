package pe.edu.upc.evolucion.bpm.taskmanager.dac.test;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.IMasterDataService;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskStates;

/**
 *
 * @author USUARIO
 */
// http://docs.spring.io/spring-batch/reference/html/testing.html
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hibernate-spring_test.xml"})
public class TaskStatesTest {
    @Autowired
    IMasterDataService mds;
    
    @Test
    public void taskStatesExists() throws DaoRepositoryException {
        assertTrue( mds.getAllTaskStates().size() > 0);
    }
    
    @Test
    public void createdStateExists() throws DaoRepositoryException {
        TaskStates state = mds.getTaskStateById(1);
        assertNotNull( state );
        assertEquals("CREATED", state.getState());
    }
}
