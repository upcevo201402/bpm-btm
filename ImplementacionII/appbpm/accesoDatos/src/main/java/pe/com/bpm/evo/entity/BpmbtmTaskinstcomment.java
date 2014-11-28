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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "BPMBTM_TASKINSTCOMMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskinstcomment.findAll", query = "SELECT b FROM BpmbtmTaskinstcomment b")})
public class BpmbtmTaskinstcomment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMMENTID")
    private Integer commentid;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "CREATIONTIME")
    @Temporal(TemporalType.DATE)
    private Date creationtime;
    @Basic(optional = false)
    @Column(name = "LASTMODIFIEDBY")
    private String lastmodifiedby;
    @Basic(optional = false)
    @Column(name = "LASTMODIFIEDTIME")
    @Temporal(TemporalType.DATE)
    private Date lastmodifiedtime;
    @Basic(optional = false)
    @Column(name = "COMMENT")
    private String comment;
    @JoinColumn(name = "TASKINSTANCEID", referencedColumnName = "TASKINSTANCEID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BpmbtmTaskinstance taskinstanceid;

    public BpmbtmTaskinstcomment() {
    }

    public BpmbtmTaskinstcomment(Integer commentid) {
        this.commentid = commentid;
    }

    public BpmbtmTaskinstcomment(Integer commentid, String username, Date creationtime, String lastmodifiedby, Date lastmodifiedtime, String comment) {
        this.commentid = commentid;
        this.username = username;
        this.creationtime = creationtime;
        this.lastmodifiedby = lastmodifiedby;
        this.lastmodifiedtime = lastmodifiedtime;
        this.comment = comment;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public Date getLastmodifiedtime() {
        return lastmodifiedtime;
    }

    public void setLastmodifiedtime(Date lastmodifiedtime) {
        this.lastmodifiedtime = lastmodifiedtime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BpmbtmTaskinstance getTaskinstanceid() {
        return taskinstanceid;
    }

    public void setTaskinstanceid(BpmbtmTaskinstance taskinstanceid) {
        this.taskinstanceid = taskinstanceid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentid != null ? commentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskinstcomment)) {
            return false;
        }
        BpmbtmTaskinstcomment other = (BpmbtmTaskinstcomment) object;
        if ((this.commentid == null && other.commentid != null) || (this.commentid != null && !this.commentid.equals(other.commentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskinstcomment[ commentid=" + commentid + " ]";
    }
    
}
