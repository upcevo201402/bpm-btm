
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="taskIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="commentIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "taskIdentifier",
    "commentIdentifier",
    "text"
})
@XmlRootElement(name = "updateComment")
public class UpdateComment {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String taskIdentifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String commentIdentifier;
    @XmlElement(required = true)
    protected String text;

    /**
     * Gets the value of the taskIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskIdentifier() {
        return taskIdentifier;
    }

    /**
     * Sets the value of the taskIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskIdentifier(String value) {
        this.taskIdentifier = value;
    }

    /**
     * Gets the value of the commentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentIdentifier() {
        return commentIdentifier;
    }

    /**
     * Sets the value of the commentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentIdentifier(String value) {
        this.commentIdentifier = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
