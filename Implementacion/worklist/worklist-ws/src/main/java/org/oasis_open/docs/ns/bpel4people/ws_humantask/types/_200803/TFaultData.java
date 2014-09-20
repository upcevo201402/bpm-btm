
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tFaultData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFaultData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="faultData" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFaultData", propOrder = {
    "faultName",
    "faultData"
})
public class TFaultData {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String faultName;
    @XmlElement(required = true)
    protected Object faultData;

    /**
     * Gets the value of the faultName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultName() {
        return faultName;
    }

    /**
     * Sets the value of the faultName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultName(String value) {
        this.faultName = value;
    }

    /**
     * Gets the value of the faultData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFaultData() {
        return faultData;
    }

    /**
     * Sets the value of the faultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFaultData(Object value) {
        this.faultData = value;
    }

}
