package pe.edu.upc.evolucion.bpm.taskmanager.dac.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.DaoRepositoryException;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.IMasterDataRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.ITaskDefinitionRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.dao.repository.ITaskInstancesRepository;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskDefinition;
import pe.edu.upc.evolucion.bpm.taskmanager.dac.domain.TaskInstance;

/**
 *
 * @author USUARIO
 */
// http://docs.spring.io/spring-batch/reference/html/testing.html
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/hibernate-spring_test.xml"})
public class TaskInstanceTest {

    @Autowired
    ITaskDefinitionRepository repository;
    
    @Autowired
    ITaskInstancesRepository taskInstRepository;

    @Autowired
    ITaskDefinitionRepository taskDefRepository;

    @Test
    public void successfulTaskCreation() throws DaoRepositoryException {
        createDefinition();
        TaskDefinition taskDef = taskDefRepository.getTasksDefinition().get(0);

        TaskInstance theTask = new TaskInstance();
        theTask.setPriority(3);
        theTask.setTaskDef(taskDef);
        theTask.setTitle(taskDef.getName());
        String taskId = taskInstRepository.createTask(theTask, "ianache");
        Assert.assertNotNull(taskId);
    }

    private void createDefinition() throws DaoRepositoryException {
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
        String taskId = repository.createTaskDefinition(taskDef);
        Assert.assertNotNull(taskId);
    }

}
