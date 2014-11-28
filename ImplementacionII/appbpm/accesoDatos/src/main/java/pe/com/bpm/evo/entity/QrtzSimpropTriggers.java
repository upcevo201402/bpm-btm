/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.bpm.evo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "QRTZ_SIMPROP_TRIGGERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrtzSimpropTriggers.findAll", query = "SELECT q FROM QrtzSimpropTriggers q")})
public class QrtzSimpropTriggers implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QrtzSimpropTriggersPK qrtzSimpropTriggersPK;
    @Column(name = "STR_PROP_1")
    private String strProp1;
    @Column(name = "STR_PROP_2")
    private String strProp2;
    @Column(name = "STR_PROP_3")
    private String strProp3;
    @Column(name = "INT_PROP_1")
    private Integer intProp1;
    @Column(name = "INT_PROP_2")
    private Integer intProp2;
    @Column(name = "LONG_PROP_1")
    private BigInteger longProp1;
    @Column(name = "LONG_PROP_2")
    private BigInteger longProp2;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEC_PROP_1")
    private BigDecimal decProp1;
    @Column(name = "DEC_PROP_2")
    private BigDecimal decProp2;
    @Column(name = "BOOL_PROP_1")
    private String boolProp1;
    @Column(name = "BOOL_PROP_2")
    private String boolProp2;
    @JoinColumns({
        @JoinColumn(name = "SCHED_NAME", referencedColumnName = "SCHED_NAME", insertable = false, updatable = false),
        @JoinColumn(name = "TRIGGER_NAME", referencedColumnName = "TRIGGER_NAME", insertable = false, updatable = false),
        @JoinColumn(name = "TRIGGER_GROUP", referencedColumnName = "TRIGGER_GROUP", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private QrtzTriggers qrtzTriggers;

    public QrtzSimpropTriggers() {
    }

    public QrtzSimpropTriggers(QrtzSimpropTriggersPK qrtzSimpropTriggersPK) {
        this.qrtzSimpropTriggersPK = qrtzSimpropTriggersPK;
    }

    public QrtzSimpropTriggers(String schedName, String triggerName, String triggerGroup) {
        this.qrtzSimpropTriggersPK = new QrtzSimpropTriggersPK(schedName, triggerName, triggerGroup);
    }

    public QrtzSimpropTriggersPK getQrtzSimpropTriggersPK() {
        return qrtzSimpropTriggersPK;
    }

    public void setQrtzSimpropTriggersPK(QrtzSimpropTriggersPK qrtzSimpropTriggersPK) {
        this.qrtzSimpropTriggersPK = qrtzSimpropTriggersPK;
    }

    public String getStrProp1() {
        return strProp1;
    }

    public void setStrProp1(String strProp1) {
        this.strProp1 = strProp1;
    }

    public String getStrProp2() {
        return strProp2;
    }

    public void setStrProp2(String strProp2) {
        this.strProp2 = strProp2;
    }

    public String getStrProp3() {
        return strProp3;
    }

    public void setStrProp3(String strProp3) {
        this.strProp3 = strProp3;
    }

    public Integer getIntProp1() {
        return intProp1;
    }

    public void setIntProp1(Integer intProp1) {
        this.intProp1 = intProp1;
    }

    public Integer getIntProp2() {
        return intProp2;
    }

    public void setIntProp2(Integer intProp2) {
        this.intProp2 = intProp2;
    }

    public BigInteger getLongProp1() {
        return longProp1;
    }

    public void setLongProp1(BigInteger longProp1) {
        this.longProp1 = longProp1;
    }

    public BigInteger getLongProp2() {
        return longProp2;
    }

    public void setLongProp2(BigInteger longProp2) {
        this.longProp2 = longProp2;
    }

    public BigDecimal getDecProp1() {
        return decProp1;
    }

    public void setDecProp1(BigDecimal decProp1) {
        this.decProp1 = decProp1;
    }

    public BigDecimal getDecProp2() {
        return decProp2;
    }

    public void setDecProp2(BigDecimal decProp2) {
        this.decProp2 = decProp2;
    }

    public String getBoolProp1() {
        return boolProp1;
    }

    public void setBoolProp1(String boolProp1) {
        this.boolProp1 = boolProp1;
    }

    public String getBoolProp2() {
        return boolProp2;
    }

    public void setBoolProp2(String boolProp2) {
        this.boolProp2 = boolProp2;
    }

    public QrtzTriggers getQrtzTriggers() {
        return qrtzTriggers;
    }

    public void setQrtzTriggers(QrtzTriggers qrtzTriggers) {
        this.qrtzTriggers = qrtzTriggers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qrtzSimpropTriggersPK != null ? qrtzSimpropTriggersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzSimpropTriggers)) {
            return false;
        }
        QrtzSimpropTriggers other = (QrtzSimpropTriggers) object;
        if ((this.qrtzSimpropTriggersPK == null && other.qrtzSimpropTriggersPK != null) || (this.qrtzSimpropTriggersPK != null && !this.qrtzSimpropTriggersPK.equals(other.qrtzSimpropTriggersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzSimpropTriggers[ qrtzSimpropTriggersPK=" + qrtzSimpropTriggersPK + " ]";
    }
    
}
