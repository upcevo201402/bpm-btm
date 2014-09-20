
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskQueryResultSet;


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
 *         &lt;element name="taskQueryResultSet" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskQueryResultSet"/>
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
    "taskQueryResultSet"
})
@XmlRootElement(name = "queryResponse")
public class QueryResponse {

    @XmlElement(required = true)
    protected TTaskQueryResultSet taskQueryResultSet;

    /**
     * Gets the value of the taskQueryResultSet property.
     * 
     * @return
     *     possible object is
     *     {@link TTaskQueryResultSet }
     *     
     */
    public TTaskQueryResultSet getTaskQueryResultSet() {
        return taskQueryResultSet;
    }

    /**
     * Sets the value of the taskQueryResultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTaskQueryResultSet }
     *     
     */
    public void setTaskQueryResultSet(TTaskQueryResultSet value) {
        this.taskQueryResultSet = value;
    }

}
