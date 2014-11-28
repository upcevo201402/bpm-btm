/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpmbtm.accesodato;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@Embeddable
public class QrtzCalendarsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCHED_NAME")
    private String schedName;
    @Basic(optional = false)
    @Column(name = "CALENDAR_NAME")
    private String calendarName;

    public QrtzCalendarsPK() {
    }

    public QrtzCalendarsPK(String schedName, String calendarName) {
        this.schedName = schedName;
        this.calendarName = calendarName;
    }

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schedName != null ? schedName.hashCode() : 0);
        hash += (calendarName != null ? calendarName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QrtzCalendarsPK)) {
            return false;
        }
        QrtzCalendarsPK other = (QrtzCalendarsPK) object;
        if ((this.schedName == null && other.schedName != null) || (this.schedName != null && !this.schedName.equals(other.schedName))) {
            return false;
        }
        if ((this.calendarName == null && other.calendarName != null) || (this.calendarName != null && !this.calendarName.equals(other.calendarName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bpmbtm.accesodato.QrtzCalendarsPK[ schedName=" + schedName + ", calendarName=" + calendarName + " ]";
    }
    
}
