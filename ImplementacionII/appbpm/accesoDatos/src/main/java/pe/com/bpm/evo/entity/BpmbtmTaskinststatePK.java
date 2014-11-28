/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpmbtm.accesodato;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Embeddable
public class BpmbtmTaskinststatePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TASKINSTANCEID")
    private String taskinstanceid;
    @Basic(optional = false)
    @Column(name = "STATEID")
    private int stateid;
    @Basic(optional = false)
    @Column(name = "FROMDATE")
    @Temporal(TemporalType.DATE)
    private Date fromdate;

    public BpmbtmTaskinststatePK() {
    }

    public BpmbtmTaskinststatePK(String taskinstanceid, int stateid, Date fromdate) {
        this.taskinstanceid = taskinstanceid;
        this.stateid = stateid;
        this.fromdate = fromdate;
    }

    public String getTaskinstanceid() {
        return taskinstanceid;
    }

    public void setTaskinstanceid(String taskinstanceid) {
        this.taskinstanceid = taskinstanceid;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskinstanceid != null ? taskinstanceid.hashCode() : 0);
        hash += (int) stateid;
        hash += (fromdate != null ? fromdate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskinststatePK)) {
            return false;
        }
        BpmbtmTaskinststatePK other = (BpmbtmTaskinststatePK) object;
        if ((this.taskinstanceid == null && other.taskinstanceid != null) || (this.taskinstanceid != null && !this.taskinstanceid.equals(other.taskinstanceid))) {
            return false;
        }
        if (this.stateid != other.stateid) {
            return false;
        }
        if ((this.fromdate == null && other.fromdate != null) || (this.fromdate != null && !this.fromdate.equals(other.fromdate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskinststatePK[ taskinstanceid=" + taskinstanceid + ", stateid=" + stateid + ", fromdate=" + fromdate + " ]";
    }
    
}
