/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "QRTZ_FIRED_TRIGGERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrtzFiredTriggers.findAll", query = "SELECT q FROM QrtzFiredTriggers q")})
public class QrtzFiredTriggers implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QrtzFiredTriggersPK qrtzFiredTriggersPK;
    @Basic(optional = false)
    @Column(name = "TRIGGER_NAME")
    private String triggerName;
    @Basic(optional = false)
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;
    @Basic(optional = false)
    @Column(name = "INSTANCE_NAME")
    private String instanceName;
    @Basic(optional = false)
    @Column(name = "FIRED_TIME")
    private long firedTime;
    @Basic(optional = false)
    @Column(name = "SCHED_TIME")
    private long schedTime;
    @Basic(optional = false)
    @Column(name = "PRIORITY")
    private int priority;
    @Basic(optional = false)
    @Column(name = "STATE")
    private String state;
    @Column(name = "JOB_NAME")
    private String jobName;
    @Column(name = "JOB_GROUP")
    private String jobGroup;
    @Column(name = "IS_NONCONCURRENT")
    private String isNonconcurrent;
    @Column(name = "REQUESTS_RECOVERY")
    private String requestsRecovery;

    public QrtzFiredTriggers() {
    }

    public QrtzFiredTriggers(QrtzFiredTriggersPK qrtzFiredTriggersPK) {
        this.qrtzFiredTriggersPK = qrtzFiredTriggersPK;
    }

    public QrtzFiredTriggers(QrtzFiredTriggersPK qrtzFiredTriggersPK, String triggerName, String triggerGroup, String instanceName, long firedTime, long schedTime, int priority, String state) {
        this.qrtzFiredTriggersPK = qrtzFiredTriggersPK;
        this.triggerName = triggerName;
        this.triggerGroup = triggerGroup;
        this.instanceName = instanceName;
        this.firedTime = firedTime;
        this.schedTime = schedTime;
        this.priority = priority;
        this.state = state;
    }

    public QrtzFiredTriggers(String schedName, String entryId) {
        this.qrtzFiredTriggersPK = new QrtzFiredTriggersPK(schedName, entryId);
    }

    public QrtzFiredTriggersPK getQrtzFiredTriggersPK() {
        return qrtzFiredTriggersPK;
    }

    public void setQrtzFiredTriggersPK(QrtzFiredTriggersPK qrtzFiredTriggersPK) {
        this.qrtzFiredTriggersPK = qrtzFiredTriggersPK;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public long getFiredTime() {
        return firedTime;
    }

    public void setFiredTime(long firedTime) {
        this.firedTime = firedTime;
    }

    public long getSchedTime() {
        return schedTime;
    }

    public void setSchedTime(long schedTime) {
        this.schedTime = schedTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qrtzFiredTriggersPK != null ? qrtzFiredTriggersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzFiredTriggers)) {
            return false;
        }
        QrtzFiredTriggers other = (QrtzFiredTriggers) object;
        if ((this.qrtzFiredTriggersPK == null && other.qrtzFiredTriggersPK != null) || (this.qrtzFiredTriggersPK != null && !this.qrtzFiredTriggersPK.equals(other.qrtzFiredTriggersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzFiredTriggers[ qrtzFiredTriggersPK=" + qrtzFiredTriggersPK + " ]";
    }
    
}
