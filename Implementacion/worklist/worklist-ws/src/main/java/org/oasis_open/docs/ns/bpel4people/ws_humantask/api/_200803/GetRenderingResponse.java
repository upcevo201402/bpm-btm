
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="rendering" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "rendering"
})
@XmlRootElement(name = "getRenderingResponse")
public class GetRenderingResponse {

    @XmlElement(required = true)
    protected Object rendering;

    /**
     * Gets the value of the rendering property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRendering() {
        return rendering;
    }

    /**
     * Sets the value of the rendering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRendering(Object value) {
        this.rendering = value;
    }

}
