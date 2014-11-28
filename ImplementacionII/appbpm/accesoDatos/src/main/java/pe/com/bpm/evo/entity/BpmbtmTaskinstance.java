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
@Table(name = "BPMBTM_TASKINSTANCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskinstance.findAll", query = "SELECT b FROM BpmbtmTaskinstance b")})
public class BpmbtmTaskinstance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TASKINSTANCEID")
    private String taskinstanceid;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "PRIORITY")
    private int priority;
    @Column(name = "CONVERSATIONID")
    private String conversationid;
    @Column(name = "RESPONSEURI")
    private String responseuri;
    @Column(name = "OUTCOME")
    private String outcome;
    @JoinColumn(name = "TASKDEFID", referencedColumnName = "TASKDEFID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BpmbtmTaskdef taskdefid;
    @OneToMany(mappedBy = "parenttaskid", fetch = FetchType.LAZY)
    private List<BpmbtmTaskinstance> bpmbtmTaskinstanceList;
    @JoinColumn(name = "PARENTTASKID", referencedColumnName = "TASKINSTANCEID")
    @ManyToOne(fetch = FetchType.LAZY)
    private BpmbtmTaskinstance parenttaskid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taskinstanceid", fetch = FetchType.LAZY)
    private List<BpmbtmTaskinstcomment> bpmbtmTaskinstcommentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "taskinstanceid", fetch = FetchType.LAZY)
    private List<BpmbtmTaskinstattachment> bpmbtmTaskinstattachmentList;

    public BpmbtmTaskinstance() {
    }

    public BpmbtmTaskinstance(String taskinstanceid) {
        this.taskinstanceid = taskinstanceid;
    }

    public BpmbtmTaskinstance(String taskinstanceid, String title, int priority) {
        this.taskinstanceid = taskinstanceid;
        this.title = title;
        this.priority = priority;
    }

    public String getTaskinstanceid() {
        return taskinstanceid;
    }

    public void setTaskinstanceid(String taskinstanceid) {
        this.taskinstanceid = taskinstanceid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getConversationid() {
        return conversationid;
    }

    public void setConversationid(String conversationid) {
        this.conversationid = conversationid;
    }

    public String getResponseuri() {
        return responseuri;
    }

    public void setResponseuri(String responseuri) {
        this.responseuri = responseuri;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public BpmbtmTaskdef getTaskdefid() {
        return taskdefid;
    }

    public void setTaskdefid(BpmbtmTaskdef taskdefid) {
        this.taskdefid = taskdefid;
    }

    @XmlTransient
    public List<BpmbtmTaskinstance> getBpmbtmTaskinstanceList() {
        return bpmbtmTaskinstanceList;
    }

    public void setBpmbtmTaskinstanceList(List<BpmbtmTaskinstance> bpmbtmTaskinstanceList) {
        this.bpmbtmTaskinstanceList = bpmbtmTaskinstanceList;
    }

    public BpmbtmTaskinstance getParenttaskid() {
        return parenttaskid;
    }

    public void setParenttaskid(BpmbtmTaskinstance parenttaskid) {
        this.parenttaskid = parenttaskid;
    }

    @XmlTransient
    public List<BpmbtmTaskinstcomment> getBpmbtmTaskinstcommentList() {
        return bpmbtmTaskinstcommentList;
    }

    public void setBpmbtmTaskinstcommentList(List<BpmbtmTaskinstcomment> bpmbtmTaskinstcommentList) {
        this.bpmbtmTaskinstcommentList = bpmbtmTaskinstcommentList;
    }

    @XmlTransient
    public List<BpmbtmTaskinstattachment> getBpmbtmTaskinstattachmentList() {
        return bpmbtmTaskinstattachmentList;
    }

    public void setBpmbtmTaskinstattachmentList(List<BpmbtmTaskinstattachment> bpmbtmTaskinstattachmentList) {
        this.bpmbtmTaskinstattachmentList = bpmbtmTaskinstattachmentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskinstanceid != null ? taskinstanceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskinstance)) {
            return false;
        }
        BpmbtmTaskinstance other = (BpmbtmTaskinstance) object;
        if ((this.taskinstanceid == null && other.taskinstanceid != null) || (this.taskinstanceid != null && !this.taskinstanceid.equals(other.taskinstanceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskinstance[ taskinstanceid=" + taskinstanceid + " ]";
    }
    
}
