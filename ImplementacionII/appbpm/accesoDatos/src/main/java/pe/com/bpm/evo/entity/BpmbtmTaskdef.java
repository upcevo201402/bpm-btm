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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "BPMBTM_TASKDEF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskdef.findAll", query = "SELECT b FROM BpmbtmTaskdef b")})
public class BpmbtmTaskdef implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TASKDEFID")
    private String taskdefid;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "DEFAULTLANG")
    private String defaultlang;
    @Basic(optional = false)
    @Column(name = "COMPOSITIONTYPE")
    private Character compositiontype;
    @Basic(optional = false)
    @Column(name = "CREATIONPATTERN")
    private Character creationpattern;
    @Basic(optional = false)
    @Column(name = "PRIORITY")
    private int priority;
    @Basic(optional = false)
    @Column(name = "PORTTYPE")
    private String porttype;
    @Basic(optional = false)
    @Column(name = "OPERATIONNAME")
    private String operationname;
    @Column(name = "RESPONSEPORTTYPE")
    private String responseporttype;
    @Column(name = "RESPONSEOPERATIONNAME")
    private String responseoperationname;
    @Basic(optional = false)
    @Column(name = "OUTCOMES")
    private String outcomes;
    @Basic(optional = false)
    @Column(name = "OUTCOMEPARTQUERY")
    private String outcomepartquery;
    @Basic(optional = false)
    @Column(name = "OUTCOMEPARTQUERYLANG")
    private String outcomepartquerylang;
    @Column(name = "STARTDEADLINEEXPRESSION")
    private String startdeadlineexpression;
    @Column(name = "COMPLETIONDEADLINEEXPRESSION")
    private String completiondeadlineexpression;
    @Basic(optional = false)
    @Column(name = "ACTUALOWNERREQUIRED")
    private int actualownerrequired;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taskdefid", fetch = FetchType.LAZY)
    private List<BpmbtmTaskinstance> bpmbtmTaskinstanceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bpmbtmTaskdef", fetch = FetchType.LAZY)
    private List<BpmbtmTaskdeftitle> bpmbtmTaskdeftitleList;
    @OneToMany(mappedBy = "parenttaskdefid", fetch = FetchType.LAZY)
    private List<BpmbtmTaskdef> bpmbtmTaskdefList;
    @JoinColumn(name = "PARENTTASKDEFID", referencedColumnName = "TASKDEFID")
    @ManyToOne(fetch = FetchType.LAZY)
    private BpmbtmTaskdef parenttaskdefid;

    public BpmbtmTaskdef() {
    }

    public BpmbtmTaskdef(String taskdefid) {
        this.taskdefid = taskdefid;
    }

    public BpmbtmTaskdef(String taskdefid, String name, String defaultlang, Character compositiontype, Character creationpattern, int priority, String porttype, String operationname, String outcomes, String outcomepartquery, String outcomepartquerylang, int actualownerrequired) {
        this.taskdefid = taskdefid;
        this.name = name;
        this.defaultlang = defaultlang;
        this.compositiontype = compositiontype;
        this.creationpattern = creationpattern;
        this.priority = priority;
        this.porttype = porttype;
        this.operationname = operationname;
        this.outcomes = outcomes;
        this.outcomepartquery = outcomepartquery;
        this.outcomepartquerylang = outcomepartquerylang;
        this.actualownerrequired = actualownerrequired;
    }

    public String getTaskdefid() {
        return taskdefid;
    }

    public void setTaskdefid(String taskdefid) {
        this.taskdefid = taskdefid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultlang() {
        return defaultlang;
    }

    public void setDefaultlang(String defaultlang) {
        this.defaultlang = defaultlang;
    }

    public Character getCompositiontype() {
        return compositiontype;
    }

    public void setCompositiontype(Character compositiontype) {
        this.compositiontype = compositiontype;
    }

    public Character getCreationpattern() {
        return creationpattern;
    }

    public void setCreationpattern(Character creationpattern) {
        this.creationpattern = creationpattern;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPorttype() {
        return porttype;
    }

    public void setPorttype(String porttype) {
        this.porttype = porttype;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public String getResponseporttype() {
        return responseporttype;
    }

    public void setResponseporttype(String responseporttype) {
        this.responseporttype = responseporttype;
    }

    public String getResponseoperationname() {
        return responseoperationname;
    }

    public void setResponseoperationname(String responseoperationname) {
        this.responseoperationname = responseoperationname;
    }

    public String getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(String outcomes) {
        this.outcomes = outcomes;
    }

    public String getOutcomepartquery() {
        return outcomepartquery;
    }

    public void setOutcomepartquery(String outcomepartquery) {
        this.outcomepartquery = outcomepartquery;
    }

    public String getOutcomepartquerylang() {
        return outcomepartquerylang;
    }

    public void setOutcomepartquerylang(String outcomepartquerylang) {
        this.outcomepartquerylang = outcomepartquerylang;
    }

    public String getStartdeadlineexpression() {
        return startdeadlineexpression;
    }

    public void setStartdeadlineexpression(String startdeadlineexpression) {
        this.startdeadlineexpression = startdeadlineexpression;
    }

    public String getCompletiondeadlineexpression() {
        return completiondeadlineexpression;
    }

    public void setCompletiondeadlineexpression(String completiondeadlineexpression) {
        this.completiondeadlineexpression = completiondeadlineexpression;
    }

    public int getActualownerrequired() {
        return actualownerrequired;
    }

    public void setActualownerrequired(int actualownerrequired) {
        this.actualownerrequired = actualownerrequired;
    }

    @XmlTransient
    public List<BpmbtmTaskinstance> getBpmbtmTaskinstanceList() {
        return bpmbtmTaskinstanceList;
    }

    public void setBpmbtmTaskinstanceList(List<BpmbtmTaskinstance> bpmbtmTaskinstanceList) {
        this.bpmbtmTaskinstanceList = bpmbtmTaskinstanceList;
    }

    @XmlTransient
    public List<BpmbtmTaskdeftitle> getBpmbtmTaskdeftitleList() {
        return bpmbtmTaskdeftitleList;
    }

    public void setBpmbtmTaskdeftitleList(List<BpmbtmTaskdeftitle> bpmbtmTaskdeftitleList) {
        this.bpmbtmTaskdeftitleList = bpmbtmTaskdeftitleList;
    }

    @XmlTransient
    public List<BpmbtmTaskdef> getBpmbtmTaskdefList() {
        return bpmbtmTaskdefList;
    }

    public void setBpmbtmTaskdefList(List<BpmbtmTaskdef> bpmbtmTaskdefList) {
        this.bpmbtmTaskdefList = bpmbtmTaskdefList;
    }

    public BpmbtmTaskdef getParenttaskdefid() {
        return parenttaskdefid;
    }

    public void setParenttaskdefid(BpmbtmTaskdef parenttaskdefid) {
        this.parenttaskdefid = parenttaskdefid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskdefid != null ? taskdefid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskdef)) {
            return false;
        }
        BpmbtmTaskdef other = (BpmbtmTaskdef) object;
        if ((this.taskdefid == null && other.taskdefid != null) || (this.taskdefid != null && !this.taskdefid.equals(other.taskdefid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskdef[ taskdefid=" + taskdefid + " ]";
    }
    
}
