
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTaskEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tTaskEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="claim"/>
 *     &lt;enumeration value="start"/>
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="release"/>
 *     &lt;enumeration value="suspend"/>
 *     &lt;enumeration value="suspendUntil"/>
 *     &lt;enumeration value="resume"/>
 *     &lt;enumeration value="complete"/>
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="fail"/>
 *     &lt;enumeration value="setPriority"/>
 *     &lt;enumeration value="addAttachment"/>
 *     &lt;enumeration value="deleteattachment"/>
 *     &lt;enumeration value="addComment"/>
 *     &lt;enumeration value="skip"/>
 *     &lt;enumeration value="forward"/>
 *     &lt;enumeration value="delegate"/>
 *     &lt;enumeration value="setOutput"/>
 *     &lt;enumeration value="deleteOutput"/>
 *     &lt;enumeration value="setFault"/>
 *     &lt;enumeration value="deleteFault"/>
 *     &lt;enumeration value="activate"/>
 *     &lt;enumeration value="nominate"/>
 *     &lt;enumeration value="setGenericHumanRole"/>
 *     &lt;enumeration value="expire"/>
 *     &lt;enumeration value="escalated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tTaskEventType")
@XmlEnum
public enum TTaskEventType {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("claim")
    CLAIM("claim"),
    @XmlEnumValue("start")
    START("start"),
    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("release")
    RELEASE("release"),
    @XmlEnumValue("suspend")
    SUSPEND("suspend"),
    @XmlEnumValue("suspendUntil")
    SUSPEND_UNTIL("suspendUntil"),
    @XmlEnumValue("resume")
    RESUME("resume"),
    @XmlEnumValue("complete")
    COMPLETE("complete"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("fail")
    FAIL("fail"),
    @XmlEnumValue("setPriority")
    SET_PRIORITY("setPriority"),
    @XmlEnumValue("addAttachment")
    ADD_ATTACHMENT("addAttachment"),
    @XmlEnumValue("deleteattachment")
    DELETEATTACHMENT("deleteattachment"),
    @XmlEnumValue("addComment")
    ADD_COMMENT("addComment"),
    @XmlEnumValue("skip")
    SKIP("skip"),
    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("delegate")
    DELEGATE("delegate"),
    @XmlEnumValue("setOutput")
    SET_OUTPUT("setOutput"),
    @XmlEnumValue("deleteOutput")
    DELETE_OUTPUT("deleteOutput"),
    @XmlEnumValue("setFault")
    SET_FAULT("setFault"),
    @XmlEnumValue("deleteFault")
    DELETE_FAULT("deleteFault"),
    @XmlEnumValue("activate")
    ACTIVATE("activate"),
    @XmlEnumValue("nominate")
    NOMINATE("nominate"),
    @XmlEnumValue("setGenericHumanRole")
    SET_GENERIC_HUMAN_ROLE("setGenericHumanRole"),
    @XmlEnumValue("expire")
    EXPIRE("expire"),
    @XmlEnumValue("escalated")
    ESCALATED("escalated");
    private final String value;

    TTaskEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTaskEventType fromValue(String v) {
        for (TTaskEventType c: TTaskEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
