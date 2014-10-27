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
@Table(name = "BPMBTM_TASKINSTANCESTATE")
@NamedQueries({
    @NamedQuery(name="TaskInstanceState.findAll", query="select p from TaskInstanceState p")
})
public class TaskInstanceState implements Serializable {
    @Id @Getter @Setter @Column(name="STATEID")
    private Integer id;
    @Getter @Setter @Column(name="STATE")
    private String state;
}
