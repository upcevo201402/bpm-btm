
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPredefinedStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tPredefinedStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="RESERVED"/>
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="EXITED"/>
 *     &lt;enumeration value="OBSOLETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tPredefinedStatus")
@XmlEnum
public enum TPredefinedStatus {

    CREATED,
    READY,
    RESERVED,
    IN_PROGRESS,
    SUSPENDED,
    COMPLETED,
    FAILED,
    ERROR,
    EXITED,
    OBSOLETE;

    public String value() {
        return name();
    }

    public static TPredefinedStatus fromValue(String v) {
        return valueOf(v);
    }

}
