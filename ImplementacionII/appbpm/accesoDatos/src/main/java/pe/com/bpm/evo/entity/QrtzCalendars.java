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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Entity
@Table(name = "QRTZ_CALENDARS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QrtzCalendars.findAll", query = "SELECT q FROM QrtzCalendars q")})
public class QrtzCalendars implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QrtzCalendarsPK qrtzCalendarsPK;
    @Basic(optional = false)
    @Lob
    @Column(name = "CALENDAR")
    private byte[] calendar;

    public QrtzCalendars() {
    }

    public QrtzCalendars(QrtzCalendarsPK qrtzCalendarsPK) {
        this.qrtzCalendarsPK = qrtzCalendarsPK;
    }

    public QrtzCalendars(QrtzCalendarsPK qrtzCalendarsPK, byte[] calendar) {
        this.qrtzCalendarsPK = qrtzCalendarsPK;
        this.calendar = calendar;
    }

    public QrtzCalendars(String schedName, String calendarName) {
        this.qrtzCalendarsPK = new QrtzCalendarsPK(schedName, calendarName);
    }

    public QrtzCalendarsPK getQrtzCalendarsPK() {
        return qrtzCalendarsPK;
    }

    public void setQrtzCalendarsPK(QrtzCalendarsPK qrtzCalendarsPK) {
        this.qrtzCalendarsPK = qrtzCalendarsPK;
    }

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (qrtzCalendarsPK != null ? qrtzCalendarsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzCalendars)) {
            return false;
        }
        QrtzCalendars other = (QrtzCalendars) object;
        if ((this.qrtzCalendarsPK == null && other.qrtzCalendarsPK != null) || (this.qrtzCalendarsPK != null && !this.qrtzCalendarsPK.equals(other.qrtzCalendarsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzCalendars[ qrtzCalendarsPK=" + qrtzCalendarsPK + " ]";
    }
    
}
