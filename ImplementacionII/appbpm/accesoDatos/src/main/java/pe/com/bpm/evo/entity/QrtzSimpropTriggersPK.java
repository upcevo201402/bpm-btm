/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Embeddable
public class QrtzSimpropTriggersPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCHED_NAME")
    private String schedName;
    @Basic(optional = false)
    @Column(name = "TRIGGER_NAME")
    private String triggerName;
    @Basic(optional = false)
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    public QrtzSimpropTriggersPK() {
    }

    public QrtzSimpropTriggersPK(String schedName, String triggerName, String triggerGroup) {
        this.schedName = schedName;
        this.triggerName = triggerName;
        this.triggerGroup = triggerGroup;
    }

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schedName != null ? schedName.hashCode() : 0);
        hash += (triggerName != null ? triggerName.hashCode() : 0);
        hash += (triggerGroup != null ? triggerGroup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzSimpropTriggersPK)) {
            return false;
        }
        QrtzSimpropTriggersPK other = (QrtzSimpropTriggersPK) object;
        if ((this.schedName == null && other.schedName != null) || (this.schedName != null && !this.schedName.equals(other.schedName))) {
            return false;
        }
        if ((this.triggerName == null && other.triggerName != null) || (this.triggerName != null && !this.triggerName.equals(other.triggerName))) {
            return false;
        }
        if ((this.triggerGroup == null && other.triggerGroup != null) || (this.triggerGroup != null && !this.triggerGroup.equals(other.triggerGroup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzSimpropTriggersPK[ schedName=" + schedName + ", triggerName=" + triggerName + ", triggerGroup=" + triggerGroup + " ]";
    }
    
}
