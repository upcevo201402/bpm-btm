package pe.edu.upc.evolucion.bpm.taskmanager.dac.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "BPMBTM_TASKDEF")
@NamedQueries({
    @NamedQuery(name = "TaskDefinition.findAll", query = "from TaskDefinition d")
})
public class TaskDefinition implements Serializable {

    @Id
    @Column(name = "TASKDEFID")
    @Setter
    @Getter
    private String id;

    @Column(name = "NAME")
    @Setter
    @Getter
    private String name;

    @Column(name = "DEFAULTLANG")
    @Setter
    @Getter
    private String defaultLanguage;

    @Column(name = "COMPOSITIONTYPE")
    @Setter
    @Getter
    private String subTasksCompositionType;

    @Column(name = "CREATIONPATTERN")
    @Setter
    @Getter
    private String subTasksCreationPattern;

   /* @Setter
    @Getter
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = TaskDefinition.class)
    private TaskDefinition parentTaskDefinition;*/

    @Column(name = "PRIORITY")
    @Setter
    @Getter
    private Integer priority;

    @Column(name = "PORTTYPE")
    @Setter
    @Getter
    private String portType;

    @Column(name = "OPERATIONNAME")
    @Setter
    @Getter
    private String operationName;

    @Column(name = "RESPONSEPORTTYPE")
    @Setter
    @Getter
    private String responsePortType;

    @Column(name = "RESPONSEOPERATIONNAME")
    @Setter
    @Getter
    private String responseOperationName;

    @Column(name = "OUTCOMES")
    @Setter
    @Getter
    private String outcomes;

    @Column(name = "OUTCOMEPARTQUERY")
    @Setter
    @Getter
    private String outcomePartQuery;

    @Column(name = "OUTCOMEPARTQUERYLANG")
    @Setter
    @Getter
    private String outcomePartQueryLanguage;

    @Column(name = "ACTUALOWNERREQUIRED")
    @Setter
    @Getter
    private Integer actualOwnerRequired;

    @OneToMany(mappedBy = "taskDef", targetEntity = TaskInstance.class, fetch = FetchType.LAZY)
    @Setter
    @Getter
    private List<TaskInstance> instances;
}
