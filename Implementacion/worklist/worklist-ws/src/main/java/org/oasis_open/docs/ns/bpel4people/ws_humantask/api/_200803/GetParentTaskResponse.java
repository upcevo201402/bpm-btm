
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskDetails;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentTask" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parentTask"
})
@XmlRootElement(name = "getParentTaskResponse")
public class GetParentTaskResponse {

    protected TTaskDetails parentTask;

    /**
     * Gets the value of the parentTask property.
     * 
     * @return
     *     possible object is
     *     {@link TTaskDetails }
     *     
     */
    public TTaskDetails getParentTask() {
        return parentTask;
    }

    /**
     * Sets the value of the parentTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTaskDetails }
     *     
     */
    public void setParentTask(TTaskDetails value) {
        this.parentTask = value;
    }

}
