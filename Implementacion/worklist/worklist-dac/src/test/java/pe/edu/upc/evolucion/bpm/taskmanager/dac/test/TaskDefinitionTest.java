package pe.edu.upc.evolucion.bpm.taskmanager.dac.test;

import java.util.UUID;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.ITaskDefinitionRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.ITaskInstancesRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskDefinition;

/**
 *
 * @author USUARIO
 */
// http://docs.spring.io/spring-batch/reference/html/testing.html
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hibernate-spring_test.xml"})
public class TaskDefinitionTest {
    @Autowired
    ITaskDefinitionRepository repository;
    
    @Test
    public void successfulTaskCreation() throws DaoRepositoryException {
        System.out.println("UUID Length: " + UUID.randomUUID().toString().length());
        TaskDefinition taskDef = new TaskDefinition();
        taskDef.setName("Emitir factura");
        taskDef.setActualOwnerRequired(1);
        taskDef.setDefaultLanguage("ES");
        taskDef.setOperationName("op1");
        taskDef.setOutcomePartQuery("");
        taskDef.setOutcomePartQueryLanguage("");
        taskDef.setOutcomes("ACEPTAR,CANCELAR");
        taskDef.setPortType("PortType");
        taskDef.setPriority(3);
        taskDef.setResponseOperationName("");
        taskDef.setResponsePortType("");
        taskDef.setSubTasksCompositionType("M");
        taskDef.setSubTasksCreationPattern("P");
        String taskId = repository.createTaskDefinition(taskDef );
        Assert.assertNotNull(taskId);
    }
    
}
