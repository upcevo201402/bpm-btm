/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.entity;

import java.io.Serializable;
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
@Table(name = "BPMBTM_TASKPEOPLEASSIGNMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskpeopleassignment.findAll", query = "SELECT b FROM BpmbtmTaskpeopleassignment b")})
public class BpmbtmTaskpeopleassignment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BpmbtmTaskpeopleassignmentPK bpmbtmTaskpeopleassignmentPK;
    @Column(name = "LOGICALPEOPLEGROUPS")
    private String logicalpeoplegroups;
    @Column(name = "USERSNAME")
    private String usersname;

    public BpmbtmTaskpeopleassignment() {
    }

    public BpmbtmTaskpeopleassignment(BpmbtmTaskpeopleassignmentPK bpmbtmTaskpeopleassignmentPK) {
        this.bpmbtmTaskpeopleassignmentPK = bpmbtmTaskpeopleassignmentPK;
    }

    public BpmbtmTaskpeopleassignment(int humanroleid, String taskdefid) {
        this.bpmbtmTaskpeopleassignmentPK = new BpmbtmTaskpeopleassignmentPK(humanroleid, taskdefid);
    }

    public BpmbtmTaskpeopleassignmentPK getBpmbtmTaskpeopleassignmentPK() {
        return bpmbtmTaskpeopleassignmentPK;
    }

    public void setBpmbtmTaskpeopleassignmentPK(BpmbtmTaskpeopleassignmentPK bpmbtmTaskpeopleassignmentPK) {
        this.bpmbtmTaskpeopleassignmentPK = bpmbtmTaskpeopleassignmentPK;
    }

    public String getLogicalpeoplegroups() {
        return logicalpeoplegroups;
    }

    public void setLogicalpeoplegroups(String logicalpeoplegroups) {
        this.logicalpeoplegroups = logicalpeoplegroups;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bpmbtmTaskpeopleassignmentPK != null ? bpmbtmTaskpeopleassignmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskpeopleassignment)) {
            return false;
        }
        BpmbtmTaskpeopleassignment other = (BpmbtmTaskpeopleassignment) object;
        if ((this.bpmbtmTaskpeopleassignmentPK == null && other.bpmbtmTaskpeopleassignmentPK != null) || (this.bpmbtmTaskpeopleassignmentPK != null && !this.bpmbtmTaskpeopleassignmentPK.equals(other.bpmbtmTaskpeopleassignmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskpeopleassignment[ bpmbtmTaskpeopleassignmentPK=" + bpmbtmTaskpeopleassignmentPK + " ]";
    }
    
}
