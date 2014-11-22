package pe.edu.upc.evolucion.bpm.taskmanager.dac.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
//import org.hibernate.annotations.Table;

/**
 *
 * @author USUARIO
 */
@Entity()
@Table(name = "BPMBTM_TASKEVENT")
@NamedQueries({
    @NamedQuery(name = "TaskInstanceEvent.findAll", query = "select d from TaskInstanceEvent d"),
    @NamedQuery(name = "TaskInstanceEvent.current", query = "select d from TaskInstanceEvent d where d.taskId = :theTaskId Order by d.eventTime desc"),
    @NamedQuery(name = "TaskInstanceEvent.findTaskEventState", query = "select d from TaskInstanceEvent d where d.taskId = :theTaskId and d.stateId = :theStateId Order by d.eventTime desc"),
    @NamedQuery(name = "TaskInstanceEvent.findTaskEventOperation", query = "select d from TaskInstanceEvent d where d.taskId = :theTaskId and d.stateId = :theOperationId Order by d.eventTime desc"),
    @NamedQuery(name = "TaskInstanceEvent.findTaskEventUserName", query = "select d from TaskInstanceEvent d where d.taskId = :theTaskId and d.userName = :theUserName Order by d.eventTime desc")
})
public class TaskInstanceEvent implements Serializable {

    private @Column(name = "EVENTID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Getter
    @Setter
    Integer eventId;
    
    private @Column(name = "TASKID")
    @Getter
    @Setter
    String taskId;
    
    private @Column(name = "EVENTTIME")
    @Getter
    @Setter
    Date eventTime;
    
    private @Column(name = "USERID")
    @Getter
    @Setter
    String userName;
    
    private @Column(name = "EVENTTYPEID")
    @Getter
    @Setter
    Integer eventTypeId;
    
    private @Column(name = "EVENTDATA")
    @Getter
    @Setter
    char[] blob;
    
    private @Column(name = "STATEID")
    @Getter
    @Setter
    Integer stateId;
}
