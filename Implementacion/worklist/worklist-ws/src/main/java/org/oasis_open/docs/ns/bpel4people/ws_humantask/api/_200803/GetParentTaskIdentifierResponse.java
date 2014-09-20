
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="parentTaskIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
    "parentTaskIdentifier"
})
@XmlRootElement(name = "getParentTaskIdentifierResponse")
public class GetParentTaskIdentifierResponse {

    @XmlSchemaType(name = "anyURI")
    protected String parentTaskIdentifier;

    /**
     * Gets the value of the parentTaskIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTaskIdentifier() {
        return parentTaskIdentifier;
    }

    /**
     * Sets the value of the parentTaskIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTaskIdentifier(String value) {
        this.parentTaskIdentifier = value;
    }

}
