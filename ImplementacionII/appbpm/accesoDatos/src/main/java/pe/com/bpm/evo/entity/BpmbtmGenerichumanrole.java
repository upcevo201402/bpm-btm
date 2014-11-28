/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpmbtm.accesodato;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "BPMBTM_GENERICHUMANROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmGenerichumanrole.findAll", query = "SELECT b FROM BpmbtmGenerichumanrole b")})
public class BpmbtmGenerichumanrole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HUMANROLEID")
    private Integer humanroleid;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;

    public BpmbtmGenerichumanrole() {
    }

    public BpmbtmGenerichumanrole(Integer humanroleid) {
        this.humanroleid = humanroleid;
    }

    public BpmbtmGenerichumanrole(Integer humanroleid, String name) {
        this.humanroleid = humanroleid;
        this.name = name;
    }

    public Integer getHumanroleid() {
        return humanroleid;
    }

    public void setHumanroleid(Integer humanroleid) {
        this.humanroleid = humanroleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (humanroleid != null ? humanroleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmGenerichumanrole)) {
            return false;
        }
        BpmbtmGenerichumanrole other = (BpmbtmGenerichumanrole) object;
        if ((this.humanroleid == null && other.humanroleid != null) || (this.humanroleid != null && !this.humanroleid.equals(other.humanroleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmGenerichumanrole[ humanroleid=" + humanroleid + " ]";
    }
    
}
