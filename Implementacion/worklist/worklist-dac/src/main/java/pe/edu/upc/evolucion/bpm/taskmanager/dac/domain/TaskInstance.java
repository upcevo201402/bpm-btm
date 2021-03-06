package pe.edu.upc.evolucion.bpm.taskmanager.dac.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Setter;
import lombok.Getter;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="BPMBTM_TASKINSTANCE")
@NamedQueries({
    @NamedQuery(name="TaskInstance.findAll", query="select t from TaskInstance t")
})
public class TaskInstance implements Serializable {
    @Id
    @Column(name = "TASKINSTANCEID")
    @Setter @Getter private String id;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = TaskDefinition.class)
    @JoinColumn(name="TASKDEFID", nullable=false, updatable=false)
    @Setter @Getter private TaskDefinition taskDef;
    
    @Column(name = "TITLE")
    @Setter @Getter private String title;
    
    @Column(name = "PRIORITY")
    @Setter @Getter private Integer priority;
    
    @Column(name = "OUTCOME")
    @Setter @Getter private String outcome;

    @Column(name = "PARENTTASKID")
    @Setter @Getter private String parentTaskId;
}
