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
public class BpmbtmTaskdeftitlePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TASKDEFID")
    private String taskdefid;
    @Basic(optional = false)
    @Column(name = "LANGUAGE")
    private String language;

    public BpmbtmTaskdeftitlePK() {
    }

    public BpmbtmTaskdeftitlePK(String taskdefid, String language) {
        this.taskdefid = taskdefid;
        this.language = language;
    }

    public String getTaskdefid() {
        return taskdefid;
    }

    public void setTaskdefid(String taskdefid) {
        this.taskdefid = taskdefid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskdefid != null ? taskdefid.hashCode() : 0);
        hash += (language != null ? language.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskdeftitlePK)) {
            return false;
        }
        BpmbtmTaskdeftitlePK other = (BpmbtmTaskdeftitlePK) object;
        if ((this.taskdefid == null && other.taskdefid != null) || (this.taskdefid != null && !this.taskdefid.equals(other.taskdefid))) {
            return false;
        }
        if ((this.language == null && other.language != null) || (this.language != null && !this.language.equals(other.language))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskdeftitlePK[ taskdefid=" + taskdefid + ", language=" + language + " ]";
    }
    
}
