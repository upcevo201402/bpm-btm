
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskInstanceData;


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
 *         &lt;element name="taskInstanceData" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskInstanceData"/>
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
    "taskInstanceData"
})
@XmlRootElement(name = "getTaskInstanceDataResponse")
public class GetTaskInstanceDataResponse {

    @XmlElement(required = true)
    protected TTaskInstanceData taskInstanceData;

    /**
     * Gets the value of the taskInstanceData property.
     * 
     * @return
     *     possible object is
     *     {@link TTaskInstanceData }
     *     
     */
    public TTaskInstanceData getTaskInstanceData() {
        return taskInstanceData;
    }

    /**
     * Sets the value of the taskInstanceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTaskInstanceData }
     *     
     */
    public void setTaskInstanceData(TTaskInstanceData value) {
        this.taskInstanceData = value;
    }

}
