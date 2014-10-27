package pe.edu.upc.evolucion.bpm.taskmanager.model.ejb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.edu.upc.evolucion.bpm.taskmanager.model.dto.TaskContext;

/**
 *
 * @author USUARIO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_test.xml"})
public class TaskServiceEJBTest {
    @Autowired
    TaskServiceSessionBeanRemote ejbService;
    
    public TaskServiceEJBTest() {
    }    

    @Test
    public void claimSuccessful() throws TaskServiceException {
        TaskContext ctx = null;
        String taskId = "adadasdasd";
        ejbService.claim(ctx, taskId);
    }
}
