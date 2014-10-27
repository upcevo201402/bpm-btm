/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.evolucion.bpm.taskmanager.model.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
public class Task {
    private @Getter @Setter String taskId;
    private @Getter @Setter String name;
    private @Getter @Setter TaskTypeEnum taskType;
    private @Getter @Setter TaskStatusEnum status;
    private @Getter @Setter Integer priority;
    private @Getter @Setter Date createdTime;
    private @Getter @Setter Date activationTime;
}
