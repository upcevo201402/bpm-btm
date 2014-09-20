
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for tBatchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBatchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;choice>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803}illegalState"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803}illegalArgument"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803}illegalAccess"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803}illegalOperation"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803}recipientNotAllowed"/>
 *           &lt;any processContents='lax' namespace='##other'/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBatchResponse", propOrder = {
    "identifier",
    "illegalState",
    "illegalArgument",
    "illegalAccess",
    "illegalOperation",
    "recipientNotAllowed",
    "any"
})
public class TBatchResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String identifier;
    protected IllegalState illegalState;
    protected String illegalArgument;
    protected String illegalAccess;
    protected String illegalOperation;
    protected String recipientNotAllowed;
    @XmlAnyElement(lax = true)
    protected Object any;

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
     * Gets the value of the illegalState property.
     * 
     * @return
     *     possible object is
     *     {@link IllegalState }
     *     
     */
    public IllegalState getIllegalState() {
        return illegalState;
    }

    /**
     * Sets the value of the illegalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link IllegalState }
     *     
     */
    public void setIllegalState(IllegalState value) {
        this.illegalState = value;
    }

    /**
     * Gets the value of the illegalArgument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIllegalArgument() {
        return illegalArgument;
    }

    /**
     * Sets the value of the illegalArgument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIllegalArgument(String value) {
        this.illegalArgument = value;
    }

    /**
     * Gets the value of the illegalAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIllegalAccess() {
        return illegalAccess;
    }

    /**
     * Sets the value of the illegalAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIllegalAccess(String value) {
        this.illegalAccess = value;
    }

    /**
     * Gets the value of the illegalOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIllegalOperation() {
        return illegalOperation;
    }

    /**
     * Sets the value of the illegalOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIllegalOperation(String value) {
        this.illegalOperation = value;
    }

    /**
     * Gets the value of the recipientNotAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientNotAllowed() {
        return recipientNotAllowed;
    }

    /**
     * Sets the value of the recipientNotAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientNotAllowed(String value) {
        this.recipientNotAllowed = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
