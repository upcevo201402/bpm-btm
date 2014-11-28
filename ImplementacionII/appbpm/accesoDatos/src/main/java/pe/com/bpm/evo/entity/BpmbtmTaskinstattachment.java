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
import javax.persistence.Lob;
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
@Table(name = "BPMBTM_TASKINSTATTACHMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BpmbtmTaskinstattachment.findAll", query = "SELECT b FROM BpmbtmTaskinstattachment b")})
public class BpmbtmTaskinstattachment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ATTACHMENTID")
    private Integer attachmentid;
    @Basic(optional = false)
    @Lob
    @Column(name = "CONTENT")
    private byte[] content;
    @Basic(optional = false)
    @Column(name = "CREATIONTIME")
    @Temporal(TemporalType.DATE)
    private Date creationtime;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "FILENAME")
    private String filename;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "FILESIZE")
    private Integer filesize;
    @Column(name = "DOCID")
    private String docid;
    @Column(name = "CONTENTSERVERID")
    private String contentserverid;
    @Basic(optional = false)
    @Column(name = "CONTENTTYPE")
    private String contenttype;
    @JoinColumn(name = "TASKINSTANCEID", referencedColumnName = "TASKINSTANCEID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BpmbtmTaskinstance taskinstanceid;

    public BpmbtmTaskinstattachment() {
    }

    public BpmbtmTaskinstattachment(Integer attachmentid) {
        this.attachmentid = attachmentid;
    }

    public BpmbtmTaskinstattachment(Integer attachmentid, byte[] content, Date creationtime, String contenttype) {
        this.attachmentid = attachmentid;
        this.content = content;
        this.creationtime = creationtime;
        this.contenttype = contenttype;
    }

    public Integer getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(Integer attachmentid) {
        this.attachmentid = attachmentid;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getContentserverid() {
        return contentserverid;
    }

    public void setContentserverid(String contentserverid) {
        this.contentserverid = contentserverid;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
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
        hash += (attachmentid != null ? attachmentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BpmbtmTaskinstattachment)) {
            return false;
        }
        BpmbtmTaskinstattachment other = (BpmbtmTaskinstattachment) object;
        if ((this.attachmentid == null && other.attachmentid != null) || (this.attachmentid != null && !this.attachmentid.equals(other.attachmentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.BpmbtmTaskinstattachment[ attachmentid=" + attachmentid + " ]";
    }
    
}
