/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpmbtm.accesodato;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "BPMBTM_TASKINSTANCESTATE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskinstancestate.findAll", query = "SELECT b FROM BpmbtmTaskinstancestate b")})
public class BpmbtmTaskinstancestate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STATEID")
    private Integer stateid;
    @Basic(optional = false)
    @Column(name = "STATE")
    private String state;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bpmbtmTaskinstancestate", fetch = FetchType.LAZY)
    private List<BpmbtmTaskinststate> bpmbtmTaskinststateList;

    public BpmbtmTaskinstancestate() {
    }

    public BpmbtmTaskinstancestate(Integer stateid) {
        this.stateid = stateid;
    }

    public BpmbtmTaskinstancestate(Integer stateid, String state) {
        this.stateid = stateid;
        this.state = state;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlTransient
    public List<BpmbtmTaskinststate> getBpmbtmTaskinststateList() {
        return bpmbtmTaskinststateList;
    }

    public void setBpmbtmTaskinststateList(List<BpmbtmTaskinststate> bpmbtmTaskinststateList) {
        this.bpmbtmTaskinststateList = bpmbtmTaskinststateList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateid != null ? stateid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskinstancestate)) {
            return false;
        }
        BpmbtmTaskinstancestate other = (BpmbtmTaskinstancestate) object;
        if ((this.stateid == null && other.stateid != null) || (this.stateid != null && !this.stateid.equals(other.stateid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskinstancestate[ stateid=" + stateid + " ]";
    }
    
}
