package pe.edu.upc.evolucion.bpm.taskmanager.dac.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="BPMBTM_TASKINSTANCESTATE")
@NamedQueries({
    @NamedQuery(name="TaskStates.findAll", query="from TaskStates d")
})
public class TaskStates implements Serializable {
    @Id
    @Column(name="STATEID")
    @Setter @Getter private Integer stateId;
    
    @Column(name="STATE")
    @Setter @Getter private String state;

    public TaskStates() {
    }    
}