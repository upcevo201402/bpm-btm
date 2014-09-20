
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="taskDetails" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskDetails" maxOccurs="unbounded" minOccurs="0"/>
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
    "taskDetails"
})
@XmlRootElement(name = "getMyTaskDetailsResponse")
public class GetMyTaskDetailsResponse {

    protected List<TTaskDetails> taskDetails;

    /**
     * Gets the value of the taskDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTaskDetails }
     * 
     * 
     */
    public List<TTaskDetails> getTaskDetails() {
        if (taskDetails == null) {
            taskDetails = new ArrayList<TTaskDetails>();
        }
        return this.taskDetails;
    }

}
