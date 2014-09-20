
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for tAttachmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAttachmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentCategory" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="attachedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="attachedBy" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser"/>
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
@XmlType(name = "tAttachmentInfo", propOrder = {
    "identifier",
    "name",
    "accessType",
    "contentType",
    "contentCategory",
    "attachedTime",
    "attachedBy",
    "any"
})
public class TAttachmentInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String identifier;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String accessType;
    @XmlElement(required = true)
    protected String contentType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String contentCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attachedTime;
    @XmlElement(required = true)
    protected String attachedBy;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the contentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentCategory() {
        return contentCategory;
    }

    /**
     * Sets the value of the contentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentCategory(String value) {
        this.contentCategory = value;
    }

    /**
     * Gets the value of the attachedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttachedTime() {
        return attachedTime;
    }

    /**
     * Sets the value of the attachedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttachedTime(XMLGregorianCalendar value) {
        this.attachedTime = value;
    }

    /**
     * Gets the value of the attachedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedBy() {
        return attachedBy;
    }

    /**
     * Sets the value of the attachedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedBy(String value) {
        this.attachedBy = value;
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
