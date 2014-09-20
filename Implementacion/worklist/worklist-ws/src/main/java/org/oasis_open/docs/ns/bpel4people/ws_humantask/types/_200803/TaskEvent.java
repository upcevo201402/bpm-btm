
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * 
 *                A detailed event that represnts a change in the task's state. 
 *             
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="eventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskEventType"/>
 *         &lt;element name="startOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tStatus"/>
 *         &lt;element name="hasData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eventData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="faultName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
    "id",
    "eventTime",
    "identifier",
    "principal",
    "eventType",
    "startOwner",
    "endOwner",
    "status",
    "hasData",
    "eventData",
    "faultName",
    "any"
})
@XmlRootElement(name = "taskEvent")
public class TaskEvent {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String identifier;
    @XmlElementRef(name = "principal", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    protected JAXBElement<String> principal;
    @XmlElement(required = true)
    protected TTaskEventType eventType;
    @XmlElementRef(name = "startOwner", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startOwner;
    @XmlElementRef(name = "endOwner", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endOwner;
    @XmlElement(required = true)
    protected String status;
    protected Boolean hasData;
    @XmlElementRef(name = "eventData", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> eventData;
    @XmlElementRef(name = "faultName", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faultName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipal(JAXBElement<String> value) {
        this.principal = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link TTaskEventType }
     *     
     */
    public TTaskEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTaskEventType }
     *     
     */
    public void setEventType(TTaskEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the startOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartOwner() {
        return startOwner;
    }

    /**
     * Sets the value of the startOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartOwner(JAXBElement<String> value) {
        this.startOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndOwner() {
        return endOwner;
    }

    /**
     * Sets the value of the endOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndOwner(JAXBElement<String> value) {
        this.endOwner = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the hasData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasData() {
        return hasData;
    }

    /**
     * Sets the value of the hasData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasData(Boolean value) {
        this.hasData = value;
    }

    /**
     * Gets the value of the eventData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getEventData() {
        return eventData;
    }

    /**
     * Sets the value of the eventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setEventData(JAXBElement<Object> value) {
        this.eventData = ((JAXBElement<Object> ) value);
    }

    /**
     * Gets the value of the faultName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaultName() {
        return faultName;
    }

    /**
     * Sets the value of the faultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaultName(JAXBElement<String> value) {
        this.faultName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
