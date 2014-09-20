
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for tTaskInstanceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTaskInstanceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}taskDetails"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}description"/>
 *         &lt;element name="input" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tMessagePartsData"/>
 *         &lt;element name="output" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tMessagePartsData"/>
 *         &lt;element name="fault" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tFaultData" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}renderings" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}comments" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}attachmentInfos" minOccurs="0"/>
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
@XmlType(name = "tTaskInstanceData", propOrder = {
    "taskDetails",
    "description",
    "input",
    "output",
    "fault",
    "renderings",
    "comments",
    "attachmentInfos",
    "any"
})
public class TTaskInstanceData {

    @XmlElement(required = true)
    protected TTaskDetails taskDetails;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected TMessagePartsData input;
    @XmlElement(required = true, nillable = true)
    protected TMessagePartsData output;
    @XmlElementRef(name = "fault", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    protected JAXBElement<TFaultData> fault;
    protected Renderings renderings;
    protected TComments comments;
    protected TAttachmentInfos attachmentInfos;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the taskDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TTaskDetails }
     *     
     */
    public TTaskDetails getTaskDetails() {
        return taskDetails;
    }

    /**
     * Sets the value of the taskDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTaskDetails }
     *     
     */
    public void setTaskDetails(TTaskDetails value) {
        this.taskDetails = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link TMessagePartsData }
     *     
     */
    public TMessagePartsData getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMessagePartsData }
     *     
     */
    public void setInput(TMessagePartsData value) {
        this.input = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link TMessagePartsData }
     *     
     */
    public TMessagePartsData getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMessagePartsData }
     *     
     */
    public void setOutput(TMessagePartsData value) {
        this.output = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TFaultData }{@code >}
     *     
     */
    public JAXBElement<TFaultData> getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TFaultData }{@code >}
     *     
     */
    public void setFault(JAXBElement<TFaultData> value) {
        this.fault = ((JAXBElement<TFaultData> ) value);
    }

    /**
     * Gets the value of the renderings property.
     * 
     * @return
     *     possible object is
     *     {@link Renderings }
     *     
     */
    public Renderings getRenderings() {
        return renderings;
    }

    /**
     * Sets the value of the renderings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Renderings }
     *     
     */
    public void setRenderings(Renderings value) {
        this.renderings = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link TComments }
     *     
     */
    public TComments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TComments }
     *     
     */
    public void setComments(TComments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the attachmentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link TAttachmentInfos }
     *     
     */
    public TAttachmentInfos getAttachmentInfos() {
        return attachmentInfos;
    }

    /**
     * Sets the value of the attachmentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAttachmentInfos }
     *     
     */
    public void setAttachmentInfos(TAttachmentInfos value) {
        this.attachmentInfos = value;
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
