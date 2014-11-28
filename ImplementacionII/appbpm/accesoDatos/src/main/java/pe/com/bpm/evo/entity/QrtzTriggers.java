/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "QRTZ_TRIGGERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrtzTriggers.findAll", query = "SELECT q FROM QrtzTriggers q")})
public class QrtzTriggers implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QrtzTriggersPK qrtzTriggersPK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "NEXT_FIRE_TIME")
    private BigInteger nextFireTime;
    @Column(name = "PREV_FIRE_TIME")
    private BigInteger prevFireTime;
    @Column(name = "PRIORITY")
    private Integer priority;
    @Basic(optional = false)
    @Column(name = "TRIGGER_STATE")
    private String triggerState;
    @Basic(optional = false)
    @Column(name = "TRIGGER_TYPE")
    private String triggerType;
    @Basic(optional = false)
    @Column(name = "START_TIME")
    private long startTime;
    @Column(name = "END_TIME")
    private BigInteger endTime;
    @Column(name = "CALENDAR_NAME")
    private String calendarName;
    @Column(name = "MISFIRE_INSTR")
    private Short misfireInstr;
    @Lob
    @Column(name = "JOB_DATA")
    private byte[] jobData;
    @JoinColumns({
        @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", insertable = false, updatable = false),
        @JoinColumn(name = "JOB_NAME", referencedColumnName = "JOB_NAME"),
        @JoinColumn(name = "JOB_GROUP", referencedColumnName = "JOB_GROUP")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private QrtzJobDetails qrtzJobDetails;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "qrtzTriggers", fetch = FetchType.LAZY)
    private QrtzBlobTriggers qrtzBlobTriggers;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "qrtzTriggers", fetch = FetchType.LAZY)
    private QrtzSimpleTriggers qrtzSimpleTriggers;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "qrtzTriggers", fetch = FetchType.LAZY)
    private QrtzCronTriggers qrtzCronTriggers;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "qrtzTriggers", fetch = FetchType.LAZY)
    private QrtzSimpropTriggers qrtzSimpropTriggers;

    public QrtzTriggers() {
    }

    public QrtzTriggers(QrtzTriggersPK qrtzTriggersPK) {
        this.qrtzTriggersPK = qrtzTriggersPK;
    }

    public QrtzTriggers(QrtzTriggersPK qrtzTriggersPK, String triggerState, String triggerType, long startTime) {
        this.qrtzTriggersPK = qrtzTriggersPK;
        this.triggerState = triggerState;
        this.triggerType = triggerType;
        this.startTime = startTime;
    }

    public QrtzTriggers(String schedName, String triggerName, String triggerGroup) {
        this.qrtzTriggersPK = new QrtzTriggersPK(schedName, triggerName, triggerGroup);
    }

    public QrtzTriggersPK getQrtzTriggersPK() {
        return qrtzTriggersPK;
    }

    public void setQrtzTriggersPK(QrtzTriggersPK qrtzTriggersPK) {
        this.qrtzTriggersPK = qrtzTriggersPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(BigInteger nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public BigInteger getPrevFireTime() {
        return prevFireTime;
    }

    public void setPrevFireTime(BigInteger prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getTriggerState() {
        return triggerState;
    }

    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public BigInteger getEndTime() {
        return endTime;
    }

    public void setEndTime(BigInteger endTime) {
        this.endTime = endTime;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public Short getMisfireInstr() {
        return misfireInstr;
    }

    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    public QrtzJobDetails getQrtzJobDetails() {
        return qrtzJobDetails;
    }

    public void setQrtzJobDetails(QrtzJobDetails qrtzJobDetails) {
        this.qrtzJobDetails = qrtzJobDetails;
    }

    public QrtzBlobTriggers getQrtzBlobTriggers() {
        return qrtzBlobTriggers;
    }

    public void setQrtzBlobTriggers(QrtzBlobTriggers qrtzBlobTriggers) {
        this.qrtzBlobTriggers = qrtzBlobTriggers;
    }

    public QrtzSimpleTriggers getQrtzSimpleTriggers() {
        return qrtzSimpleTriggers;
    }

    public void setQrtzSimpleTriggers(QrtzSimpleTriggers qrtzSimpleTriggers) {
        this.qrtzSimpleTriggers = qrtzSimpleTriggers;
    }

    public QrtzCronTriggers getQrtzCronTriggers() {
        return qrtzCronTriggers;
    }

    public void setQrtzCronTriggers(QrtzCronTriggers qrtzCronTriggers) {
        this.qrtzCronTriggers = qrtzCronTriggers;
    }

    public QrtzSimpropTriggers getQrtzSimpropTriggers() {
        return qrtzSimpropTriggers;
    }

    public void setQrtzSimpropTriggers(QrtzSimpropTriggers qrtzSimpropTriggers) {
        this.qrtzSimpropTriggers = qrtzSimpropTriggers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qrtzTriggersPK != null ? qrtzTriggersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzTriggers)) {
            return false;
        }
        QrtzTriggers other = (QrtzTriggers) object;
        if ((this.qrtzTriggersPK == null && other.qrtzTriggersPK != null) || (this.qrtzTriggersPK != null && !this.qrtzTriggersPK.equals(other.qrtzTriggersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzTriggers[ qrtzTriggersPK=" + qrtzTriggersPK + " ]";
    }
    
}
