
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tTaskHistoryFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTaskHistoryFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;sequence>
 *           &lt;element name="status" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tStatus" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="eventType" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskEventType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="afterEventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="beforeEventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTaskHistoryFilter", propOrder = {
    "eventId",
    "status",
    "eventType",
    "principal",
    "afterEventTime",
    "beforeEventTime"
})
public class TTaskHistoryFilter {

    protected BigInteger eventId;
    protected List<String> status;
    protected List<TTaskEventType> eventType;
    protected String principal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar afterEventTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beforeEventTime;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventId(BigInteger value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatus() {
        if (status == null) {
            status = new ArrayList<String>();
        }
        return this.status;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTaskEventType }
     * 
     * 
     */
    public List<TTaskEventType> getEventType() {
        if (eventType == null) {
            eventType = new ArrayList<TTaskEventType>();
        }
        return this.eventType;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Gets the value of the afterEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAfterEventTime() {
        return afterEventTime;
    }

    /**
     * Sets the value of the afterEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAfterEventTime(XMLGregorianCalendar value) {
        this.afterEventTime = value;
    }

    /**
     * Gets the value of the beforeEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeforeEventTime() {
        return beforeEventTime;
    }

    /**
     * Sets the value of the beforeEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeforeEventTime(XMLGregorianCalendar value) {
        this.beforeEventTime = value;
    }

}
