
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="deadlineName" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="deadlineExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "deadlineName",
    "deadlineExpression"
})
@XmlRootElement(name = "setTaskStartDeadlineExpression")
public class SetTaskStartDeadlineExpression {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String identifier;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String deadlineName;
    @XmlElement(required = true)
    protected String deadlineExpression;

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
     * Gets the value of the deadlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadlineName() {
        return deadlineName;
    }

    /**
     * Sets the value of the deadlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadlineName(String value) {
        this.deadlineName = value;
    }

    /**
     * Gets the value of the deadlineExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadlineExpression() {
        return deadlineExpression;
    }

    /**
     * Sets the value of the deadlineExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadlineExpression(String value) {
        this.deadlineExpression = value;
    }

}
