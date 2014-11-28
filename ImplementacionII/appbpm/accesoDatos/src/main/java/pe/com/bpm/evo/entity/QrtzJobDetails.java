/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
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
@Table(name = "QRTZ_JOB_DETAILS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrtzJobDetails.findAll", query = "SELECT q FROM QrtzJobDetails q")})
public class QrtzJobDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QrtzJobDetailsPK qrtzJobDetailsPK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "JOB_CLASS_NAME")
    private String jobClassName;
    @Basic(optional = false)
    @Column(name = "IS_DURABLE")
    private String isDurable;
    @Basic(optional = false)
    @Column(name = "IS_NONCONCURRENT")
    private String isNonconcurrent;
    @Basic(optional = false)
    @Column(name = "IS_UPDATE_DATA")
    private String isUpdateData;
    @Basic(optional = false)
    @Column(name = "REQUESTS_RECOVERY")
    private String requestsRecovery;
    @Lob
    @Column(name = "JOB_DATA")
    private byte[] jobData;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "qrtzJobDetails", fetch = FetchType.LAZY)
    private List<QrtzTriggers> qrtzTriggersList;

    public QrtzJobDetails() {
    }

    public QrtzJobDetails(QrtzJobDetailsPK qrtzJobDetailsPK) {
        this.qrtzJobDetailsPK = qrtzJobDetailsPK;
    }

    public QrtzJobDetails(QrtzJobDetailsPK qrtzJobDetailsPK, String jobClassName, String isDurable, String isNonconcurrent, String isUpdateData, String requestsRecovery) {
        this.qrtzJobDetailsPK = qrtzJobDetailsPK;
        this.jobClassName = jobClassName;
        this.isDurable = isDurable;
        this.isNonconcurrent = isNonconcurrent;
        this.isUpdateData = isUpdateData;
        this.requestsRecovery = requestsRecovery;
    }

    public QrtzJobDetails(String schedName, String jobName, String jobGroup) {
        this.qrtzJobDetailsPK = new QrtzJobDetailsPK(schedName, jobName, jobGroup);
    }

    public QrtzJobDetailsPK getQrtzJobDetailsPK() {
        return qrtzJobDetailsPK;
    }

    public void setQrtzJobDetailsPK(QrtzJobDetailsPK qrtzJobDetailsPK) {
        this.qrtzJobDetailsPK = qrtzJobDetailsPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public String getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
    }

    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public String getIsUpdateData() {
        return isUpdateData;
    }

    public void setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    @XmlTransient
    public List<QrtzTriggers> getQrtzTriggersList() {
        return qrtzTriggersList;
    }

    public void setQrtzTriggersList(List<QrtzTriggers> qrtzTriggersList) {
        this.qrtzTriggersList = qrtzTriggersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qrtzJobDetailsPK != null ? qrtzJobDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzJobDetails)) {
            return false;
        }
        QrtzJobDetails other = (QrtzJobDetails) object;
        if ((this.qrtzJobDetailsPK == null && other.qrtzJobDetailsPK != null) || (this.qrtzJobDetailsPK != null && !this.qrtzJobDetailsPK.equals(other.qrtzJobDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzJobDetails[ qrtzJobDetailsPK=" + qrtzJobDetailsPK + " ]";
    }
    
}
