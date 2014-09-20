
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for tTaskQueryResultRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTaskQueryResultRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="taskType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="status" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tStatus"/>
 *         &lt;element name="priority" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tPriority"/>
 *         &lt;element name="taskInitiator" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity"/>
 *         &lt;element name="taskStakeholders" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity"/>
 *         &lt;element name="potentialOwners" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity"/>
 *         &lt;element name="businessAdministrators" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity"/>
 *         &lt;element name="actualOwner" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser"/>
 *         &lt;element name="notificationRecipients" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity"/>
 *         &lt;element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="createdBy" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser"/>
 *         &lt;element name="lastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastModifiedBy" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser"/>
 *         &lt;element name="activationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="isSkipable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasPotentialOwners" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startByTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="completeByTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="presentationName" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tPresentationName"/>
 *         &lt;element name="presentationSubject" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tPresentationSubject"/>
 *         &lt;element name="renderingMethodName" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="hasOutput" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasFault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasComments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="escalated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parentTaskId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="hasSubtasks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="searchBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outcome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskOperations" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperations"/>
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTaskQueryResultRow", propOrder = {
    "idOrTaskTypeOrName"
})
public class TTaskQueryResultRow {

    @XmlElementRefs({
        @XmlElementRef(name = "hasFault", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "searchBy", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "expirationTime", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "createdTime", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskType", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskStakeholders", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lastModifiedBy", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "presentationSubject", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isSkipable", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "renderingMethodName", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outcome", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "parentTaskId", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasAttachments", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskOperations", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasSubtasks", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "startByTime", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "businessAdministrators", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "activationTime", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "priority", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasPotentialOwners", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasOutput", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasComments", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "createdBy", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "status", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notificationRecipients", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "taskInitiator", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "actualOwner", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "completeByTime", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lastModifiedTime", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "potentialOwners", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "presentationName", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "escalated", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> idOrTaskTypeOrName;

    /**
     * Gets the value of the idOrTaskTypeOrName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idOrTaskTypeOrName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdOrTaskTypeOrName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link QName }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TOrganizationalEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link QName }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperations }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link TOrganizationalEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TOrganizationalEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link TOrganizationalEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link TOrganizationalEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link Element }
     * 
     * 
     */
    public List<Object> getIdOrTaskTypeOrName() {
        if (idOrTaskTypeOrName == null) {
            idOrTaskTypeOrName = new ArrayList<Object>();
        }
        return this.idOrTaskTypeOrName;
    }

}
