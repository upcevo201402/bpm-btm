
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
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for tTaskDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTaskDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="taskType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="status" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tStatus"/>
 *         &lt;element name="priority" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tPriority" minOccurs="0"/>
 *         &lt;element name="taskInitiator" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser" minOccurs="0"/>
 *         &lt;element name="taskStakeholders" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity" minOccurs="0"/>
 *         &lt;element name="potentialOwners" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity" minOccurs="0"/>
 *         &lt;element name="businessAdministrators" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity" minOccurs="0"/>
 *         &lt;element name="actualOwner" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser" minOccurs="0"/>
 *         &lt;element name="notificationRecipients" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity" minOccurs="0"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="createdBy" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser" minOccurs="0"/>
 *         &lt;element name="lastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastModifiedBy" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser" minOccurs="0"/>
 *         &lt;element name="activationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isSkipable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasPotentialOwners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="startByTimeExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="completeByTimeExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="presentationName" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tPresentationName" minOccurs="0"/>
 *         &lt;element name="presentationSubject" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tPresentationSubject" minOccurs="0"/>
 *         &lt;element name="renderingMethodExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasFault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="escalated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searchBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentTaskId" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="hasSubTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "tTaskDetails", propOrder = {
    "id",
    "taskType",
    "name",
    "status",
    "priority",
    "taskInitiator",
    "taskStakeholders",
    "potentialOwners",
    "businessAdministrators",
    "actualOwner",
    "notificationRecipients",
    "createdTime",
    "createdBy",
    "lastModifiedTime",
    "lastModifiedBy",
    "activationTime",
    "expirationTime",
    "isSkipable",
    "hasPotentialOwners",
    "startByTimeExists",
    "completeByTimeExists",
    "presentationName",
    "presentationSubject",
    "renderingMethodExists",
    "hasOutput",
    "hasFault",
    "hasAttachments",
    "hasComments",
    "escalated",
    "searchBy",
    "outcome",
    "parentTaskId",
    "hasSubTasks",
    "any"
})
public class TTaskDetails {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(required = true)
    protected String taskType;
    @XmlElement(required = true)
    protected QName name;
    @XmlElement(required = true)
    protected String status;
    protected Integer priority;
    protected String taskInitiator;
    protected TOrganizationalEntity taskStakeholders;
    protected TOrganizationalEntity potentialOwners;
    protected TOrganizationalEntity businessAdministrators;
    protected String actualOwner;
    protected TOrganizationalEntity notificationRecipients;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    protected String createdBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    protected String lastModifiedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationTime;
    protected Boolean isSkipable;
    protected Boolean hasPotentialOwners;
    protected Boolean startByTimeExists;
    protected Boolean completeByTimeExists;
    protected String presentationName;
    protected String presentationSubject;
    protected boolean renderingMethodExists;
    protected Boolean hasOutput;
    protected Boolean hasFault;
    protected Boolean hasAttachments;
    protected Boolean hasComments;
    protected Boolean escalated;
    protected String searchBy;
    protected String outcome;
    @XmlSchemaType(name = "anyURI")
    protected String parentTaskId;
    protected Boolean hasSubTasks;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskType(String value) {
        this.taskType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setName(QName value) {
        this.name = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the taskInitiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInitiator() {
        return taskInitiator;
    }

    /**
     * Sets the value of the taskInitiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInitiator(String value) {
        this.taskInitiator = value;
    }

    /**
     * Gets the value of the taskStakeholders property.
     * 
     * @return
     *     possible object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public TOrganizationalEntity getTaskStakeholders() {
        return taskStakeholders;
    }

    /**
     * Sets the value of the taskStakeholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public void setTaskStakeholders(TOrganizationalEntity value) {
        this.taskStakeholders = value;
    }

    /**
     * Gets the value of the potentialOwners property.
     * 
     * @return
     *     possible object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public TOrganizationalEntity getPotentialOwners() {
        return potentialOwners;
    }

    /**
     * Sets the value of the potentialOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public void setPotentialOwners(TOrganizationalEntity value) {
        this.potentialOwners = value;
    }

    /**
     * Gets the value of the businessAdministrators property.
     * 
     * @return
     *     possible object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public TOrganizationalEntity getBusinessAdministrators() {
        return businessAdministrators;
    }

    /**
     * Sets the value of the businessAdministrators property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public void setBusinessAdministrators(TOrganizationalEntity value) {
        this.businessAdministrators = value;
    }

    /**
     * Gets the value of the actualOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualOwner() {
        return actualOwner;
    }

    /**
     * Sets the value of the actualOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualOwner(String value) {
        this.actualOwner = value;
    }

    /**
     * Gets the value of the notificationRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public TOrganizationalEntity getNotificationRecipients() {
        return notificationRecipients;
    }

    /**
     * Sets the value of the notificationRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public void setNotificationRecipients(TOrganizationalEntity value) {
        this.notificationRecipients = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedTime(XMLGregorianCalendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the activationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationTime() {
        return activationTime;
    }

    /**
     * Sets the value of the activationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationTime(XMLGregorianCalendar value) {
        this.activationTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationTime(XMLGregorianCalendar value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the isSkipable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSkipable() {
        return isSkipable;
    }

    /**
     * Sets the value of the isSkipable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSkipable(Boolean value) {
        this.isSkipable = value;
    }

    /**
     * Gets the value of the hasPotentialOwners property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPotentialOwners() {
        return hasPotentialOwners;
    }

    /**
     * Sets the value of the hasPotentialOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPotentialOwners(Boolean value) {
        this.hasPotentialOwners = value;
    }

    /**
     * Gets the value of the startByTimeExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartByTimeExists() {
        return startByTimeExists;
    }

    /**
     * Sets the value of the startByTimeExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartByTimeExists(Boolean value) {
        this.startByTimeExists = value;
    }

    /**
     * Gets the value of the completeByTimeExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteByTimeExists() {
        return completeByTimeExists;
    }

    /**
     * Sets the value of the completeByTimeExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteByTimeExists(Boolean value) {
        this.completeByTimeExists = value;
    }

    /**
     * Gets the value of the presentationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationName() {
        return presentationName;
    }

    /**
     * Sets the value of the presentationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationName(String value) {
        this.presentationName = value;
    }

    /**
     * Gets the value of the presentationSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationSubject() {
        return presentationSubject;
    }

    /**
     * Sets the value of the presentationSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationSubject(String value) {
        this.presentationSubject = value;
    }

    /**
     * Gets the value of the renderingMethodExists property.
     * 
     */
    public boolean isRenderingMethodExists() {
        return renderingMethodExists;
    }

    /**
     * Sets the value of the renderingMethodExists property.
     * 
     */
    public void setRenderingMethodExists(boolean value) {
        this.renderingMethodExists = value;
    }

    /**
     * Gets the value of the hasOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOutput() {
        return hasOutput;
    }

    /**
     * Sets the value of the hasOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOutput(Boolean value) {
        this.hasOutput = value;
    }

    /**
     * Gets the value of the hasFault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFault() {
        return hasFault;
    }

    /**
     * Sets the value of the hasFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFault(Boolean value) {
        this.hasFault = value;
    }

    /**
     * Gets the value of the hasAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    /**
     * Sets the value of the hasAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachments(Boolean value) {
        this.hasAttachments = value;
    }

    /**
     * Gets the value of the hasComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasComments() {
        return hasComments;
    }

    /**
     * Sets the value of the hasComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasComments(Boolean value) {
        this.hasComments = value;
    }

    /**
     * Gets the value of the escalated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscalated() {
        return escalated;
    }

    /**
     * Sets the value of the escalated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscalated(Boolean value) {
        this.escalated = value;
    }

    /**
     * Gets the value of the searchBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchBy() {
        return searchBy;
    }

    /**
     * Sets the value of the searchBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchBy(String value) {
        this.searchBy = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcome(String value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the parentTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTaskId() {
        return parentTaskId;
    }

    /**
     * Sets the value of the parentTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTaskId(String value) {
        this.parentTaskId = value;
    }

    /**
     * Gets the value of the hasSubTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSubTasks() {
        return hasSubTasks;
    }

    /**
     * Sets the value of the hasSubTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSubTasks(Boolean value) {
        this.hasSubTasks = value;
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
