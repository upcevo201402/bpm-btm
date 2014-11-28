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
public class QrtzLocksPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCHED_NAME")
    private String schedName;
    @Basic(optional = false)
    @Column(name = "LOCK_NAME")
    private String lockName;

    public QrtzLocksPK() {
    }

    public QrtzLocksPK(String schedName, String lockName) {
        this.schedName = schedName;
        this.lockName = lockName;
    }

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schedName != null ? schedName.hashCode() : 0);
        hash += (lockName != null ? lockName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzLocksPK)) {
            return false;
        }
        QrtzLocksPK other = (QrtzLocksPK) object;
        if ((this.schedName == null && other.schedName != null) || (this.schedName != null && !this.schedName.equals(other.schedName))) {
            return false;
        }
        if ((this.lockName == null && other.lockName != null) || (this.lockName != null && !this.lockName.equals(other.lockName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzLocksPK[ schedName=" + schedName + ", lockName=" + lockName + " ]";
    }
    
}
