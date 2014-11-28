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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "BPMBTM_TASKDEFTITLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskdeftitle.findAll", query = "SELECT b FROM BpmbtmTaskdeftitle b")})
public class BpmbtmTaskdeftitle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BpmbtmTaskdeftitlePK bpmbtmTaskdeftitlePK;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @JoinColumn(name = "TASKDEFID", referencedColumnName = "TASKDEFID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BpmbtmTaskdef bpmbtmTaskdef;

    public BpmbtmTaskdeftitle() {
    }

    public BpmbtmTaskdeftitle(BpmbtmTaskdeftitlePK bpmbtmTaskdeftitlePK) {
        this.bpmbtmTaskdeftitlePK = bpmbtmTaskdeftitlePK;
    }

    public BpmbtmTaskdeftitle(BpmbtmTaskdeftitlePK bpmbtmTaskdeftitlePK, String title) {
        this.bpmbtmTaskdeftitlePK = bpmbtmTaskdeftitlePK;
        this.title = title;
    }

    public BpmbtmTaskdeftitle(String taskdefid, String language) {
        this.bpmbtmTaskdeftitlePK = new BpmbtmTaskdeftitlePK(taskdefid, language);
    }

    public BpmbtmTaskdeftitlePK getBpmbtmTaskdeftitlePK() {
        return bpmbtmTaskdeftitlePK;
    }

    public void setBpmbtmTaskdeftitlePK(BpmbtmTaskdeftitlePK bpmbtmTaskdeftitlePK) {
        this.bpmbtmTaskdeftitlePK = bpmbtmTaskdeftitlePK;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BpmbtmTaskdef getBpmbtmTaskdef() {
        return bpmbtmTaskdef;
    }

    public void setBpmbtmTaskdef(BpmbtmTaskdef bpmbtmTaskdef) {
        this.bpmbtmTaskdef = bpmbtmTaskdef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bpmbtmTaskdeftitlePK != null ? bpmbtmTaskdeftitlePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskdeftitle)) {
            return false;
        }
        BpmbtmTaskdeftitle other = (BpmbtmTaskdeftitle) object;
        if ((this.bpmbtmTaskdeftitlePK == null && other.bpmbtmTaskdeftitlePK != null) || (this.bpmbtmTaskdeftitlePK != null && !this.bpmbtmTaskdeftitlePK.equals(other.bpmbtmTaskdeftitlePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskdeftitle[ bpmbtmTaskdeftitlePK=" + bpmbtmTaskdeftitlePK + " ]";
    }
    
}
