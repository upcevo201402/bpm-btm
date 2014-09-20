
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TRenderingTypes;


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
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="properties" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="renderingPreferences" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tRenderingTypes" maxOccurs="unbounded" minOccurs="0"/>
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
    "identifier",
    "properties",
    "renderingPreferences"
})
@XmlRootElement(name = "getTaskInstanceData")
public class GetTaskInstanceData {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String identifier;
    @XmlElement(required = true)
    protected String properties;
    protected List<TRenderingTypes> renderingPreferences;

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
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperties(String value) {
        this.properties = value;
    }

    /**
     * Gets the value of the renderingPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renderingPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenderingPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRenderingTypes }
     * 
     * 
     */
    public List<TRenderingTypes> getRenderingPreferences() {
        if (renderingPreferences == null) {
            renderingPreferences = new ArrayList<TRenderingTypes>();
        }
        return this.renderingPreferences;
    }

}
