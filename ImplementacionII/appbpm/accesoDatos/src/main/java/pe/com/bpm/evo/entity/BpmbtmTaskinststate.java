/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "BPMBTM_TASKINSTSTATE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskinststate.findAll", query = "SELECT b FROM BpmbtmTaskinststate b")})
public class BpmbtmTaskinststate implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BpmbtmTaskinststatePK bpmbtmTaskinststatePK;
    @Column(name = "THRUDATE")
    @Temporal(TemporalType.DATE)
    private Date thrudate;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @JoinColumn(name = "STATEID", referencedColumnName = "STATEID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BpmbtmTaskinstancestate bpmbtmTaskinstancestate;

    public BpmbtmTaskinststate() {
    }

    public BpmbtmTaskinststate(BpmbtmTaskinststatePK bpmbtmTaskinststatePK) {
        this.bpmbtmTaskinststatePK = bpmbtmTaskinststatePK;
    }

    public BpmbtmTaskinststate(BpmbtmTaskinststatePK bpmbtmTaskinststatePK, String username) {
        this.bpmbtmTaskinststatePK = bpmbtmTaskinststatePK;
        this.username = username;
    }

    public BpmbtmTaskinststate(String taskinstanceid, int stateid, Date fromdate) {
        this.bpmbtmTaskinststatePK = new BpmbtmTaskinststatePK(taskinstanceid, stateid, fromdate);
    }

    public BpmbtmTaskinststatePK getBpmbtmTaskinststatePK() {
        return bpmbtmTaskinststatePK;
    }

    public void setBpmbtmTaskinststatePK(BpmbtmTaskinststatePK bpmbtmTaskinststatePK) {
        this.bpmbtmTaskinststatePK = bpmbtmTaskinststatePK;
    }

    public Date getThrudate() {
        return thrudate;
    }

    public void setThrudate(Date thrudate) {
        this.thrudate = thrudate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BpmbtmTaskinstancestate getBpmbtmTaskinstancestate() {
        return bpmbtmTaskinstancestate;
    }

    public void setBpmbtmTaskinstancestate(BpmbtmTaskinstancestate bpmbtmTaskinstancestate) {
        this.bpmbtmTaskinstancestate = bpmbtmTaskinstancestate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bpmbtmTaskinststatePK != null ? bpmbtmTaskinststatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskinststate)) {
            return false;
        }
        BpmbtmTaskinststate other = (BpmbtmTaskinststate) object;
        if ((this.bpmbtmTaskinststatePK == null && other.bpmbtmTaskinststatePK != null) || (this.bpmbtmTaskinststatePK != null && !this.bpmbtmTaskinststatePK.equals(other.bpmbtmTaskinststatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskinststate[ bpmbtmTaskinststatePK=" + bpmbtmTaskinststatePK + " ]";
    }
    
}
