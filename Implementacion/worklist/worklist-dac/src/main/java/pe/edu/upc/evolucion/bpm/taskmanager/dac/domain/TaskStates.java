package pe.edu.upc.evolucion.bpm.taskmanager.dac.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
    private Integer stateId;
    @Column(name="STATE")
    private String state;

    public TaskStates() {
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }    
}