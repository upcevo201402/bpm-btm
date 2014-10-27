package pe.edu.upc.evolucion.bpm.taskmanager.model.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
public class TaskDefinition {
    private @Setter @Getter String id;
    private @Setter @Getter String description;
    private @Setter @Getter String name;
    private @Setter @Getter Integer priority;
    private @Setter @Getter String title;
    private @Setter @Getter String version;
}
