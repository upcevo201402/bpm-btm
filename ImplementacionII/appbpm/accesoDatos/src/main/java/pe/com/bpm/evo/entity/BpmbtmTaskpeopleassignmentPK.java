/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpmbtm.accesodato;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Embeddable
public class BpmbtmTaskpeopleassignmentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "HUMANROLEID")
    private int humanroleid;
    @Basic(optional = false)
    @Column(name = "TASKDEFID")
    private String taskdefid;

    public BpmbtmTaskpeopleassignmentPK() {
    }

    public BpmbtmTaskpeopleassignmentPK(int humanroleid, String taskdefid) {
        this.humanroleid = humanroleid;
        this.taskdefid = taskdefid;
    }

    public int getHumanroleid() {
        return humanroleid;
    }

    public void setHumanroleid(int humanroleid) {
        this.humanroleid = humanroleid;
    }

    public String getTaskdefid() {
        return taskdefid;
    }

    public void setTaskdefid(String taskdefid) {
        this.taskdefid = taskdefid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) humanroleid;
        hash += (taskdefid != null ? taskdefid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskpeopleassignmentPK)) {
            return false;
        }
        BpmbtmTaskpeopleassignmentPK other = (BpmbtmTaskpeopleassignmentPK) object;
        if (this.humanroleid != other.humanroleid) {
            return false;
        }
        if ((this.taskdefid == null && other.taskdefid != null) || (this.taskdefid != null && !this.taskdefid.equals(other.taskdefid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskpeopleassignmentPK[ humanroleid=" + humanroleid + ", taskdefid=" + taskdefid + " ]";
    }
    
}
