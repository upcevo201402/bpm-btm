/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpmbtm.accesodato;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "QRTZ_SIMPLE_TRIGGERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrtzSimpleTriggers.findAll", query = "SELECT q FROM QrtzSimpleTriggers q")})
public class QrtzSimpleTriggers implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QrtzSimpleTriggersPK qrtzSimpleTriggersPK;
    @Basic(optional = false)
    @Column(name = "REPEAT_COUNT")
    private long repeatCount;
    @Basic(optional = false)
    @Column(name = "REPEAT_INTERVAL")
    private long repeatInterval;
    @Basic(optional = false)
    @Column(name = "TIMES_TRIGGERED")
    private long timesTriggered;
    @JoinColumns({
        @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", insertable = false, updatable = false),
        @JoinColumn(name = "TRIGGER_NAME", referencedColumnName = "TRIGGER_NAME", insertable = false, updatable = false),
        @JoinColumn(name = "TRIGGER_GROUP", referencedColumnName = "TRIGGER_GROUP", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private QrtzTriggers qrtzTriggers;

    public QrtzSimpleTriggers() {
    }

    public QrtzSimpleTriggers(QrtzSimpleTriggersPK qrtzSimpleTriggersPK) {
        this.qrtzSimpleTriggersPK = qrtzSimpleTriggersPK;
    }

    public QrtzSimpleTriggers(QrtzSimpleTriggersPK qrtzSimpleTriggersPK, long repeatCount, long repeatInterval, long timesTriggered) {
        this.qrtzSimpleTriggersPK = qrtzSimpleTriggersPK;
        this.repeatCount = repeatCount;
        this.repeatInterval = repeatInterval;
        this.timesTriggered = timesTriggered;
    }

    public QrtzSimpleTriggers(String schedName, String triggerName, String triggerGroup) {
        this.qrtzSimpleTriggersPK = new QrtzSimpleTriggersPK(schedName, triggerName, triggerGroup);
    }

    public QrtzSimpleTriggersPK getQrtzSimpleTriggersPK() {
        return qrtzSimpleTriggersPK;
    }

    public void setQrtzSimpleTriggersPK(QrtzSimpleTriggersPK qrtzSimpleTriggersPK) {
        this.qrtzSimpleTriggersPK = qrtzSimpleTriggersPK;
    }

    public long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }

    public QrtzTriggers getQrtzTriggers() {
        return qrtzTriggers;
    }

    public void setQrtzTriggers(QrtzTriggers qrtzTriggers) {
        this.qrtzTriggers = qrtzTriggers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qrtzSimpleTriggersPK != null ? qrtzSimpleTriggersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzSimpleTriggers)) {
            return false;
        }
        QrtzSimpleTriggers other = (QrtzSimpleTriggers) object;
        if ((this.qrtzSimpleTriggersPK == null && other.qrtzSimpleTriggersPK != null) || (this.qrtzSimpleTriggersPK != null && !this.qrtzSimpleTriggersPK.equals(other.qrtzSimpleTriggersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzSimpleTriggers[ qrtzSimpleTriggersPK=" + qrtzSimpleTriggersPK + " ]";
    }
    
}
