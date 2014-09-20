
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
import org.w3c.dom.Element;


/**
 * <p>Java class for tTaskOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTaskOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="activate" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="addAttachment" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="addComment" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="claim" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="complete" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="delegate" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="deleteAttachment" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="deleteComment" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="deleteFault" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="deleteOutput" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="fail" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="forward" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getAttachment" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getAttachmentInfos" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getComments" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getFault" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getInput" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getOutcome" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getOutput" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getParentTask" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getParentTaskIdentifier" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getRendering" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getRenderingTypes" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getSubtaskIdentifiers" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getSubtasks" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getTaskDescription" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getTaskDetails" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getTaskHistory" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="getTaskInstanceData" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="hasSubtasks" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="instantiateSubtask" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="isSubtask" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="nominate" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="release" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="remove" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="resume" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setFault" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setGenericHumanRole" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setOutput" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setPriority" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setTaskCompletionDeadlineExpression" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setTaskCompletionDurationExpression" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setTaskStartDeadlineExpression" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="setTaskStartDurationExpression" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="skip" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="start" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="stop" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="suspend" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="suspendUntil" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
 *         &lt;element name="updateComment" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tTaskOperation"/>
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
@XmlType(name = "tTaskOperations", propOrder = {
    "activateOrAddAttachmentOrAddComment"
})
public class TTaskOperations {

    @XmlElementRefs({
        @XmlElementRef(name = "deleteFault", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setTaskStartDeadlineExpression", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deleteOutput", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fail", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasSubtasks", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "skip", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setOutput", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "stop", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getSubtaskIdentifiers", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "suspend", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "addComment", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getTaskHistory", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "complete", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getTaskDetails", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setPriority", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setTaskCompletionDeadlineExpression", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "updateComment", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remove", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getParentTaskIdentifier", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setGenericHumanRole", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getInput", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "resume", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getComments", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getSubtasks", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deleteAttachment", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getAttachmentInfos", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getTaskDescription", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isSubtask", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deleteComment", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "start", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "claim", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delegate", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setTaskStartDurationExpression", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getParentTask", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setTaskCompletionDurationExpression", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getRenderingTypes", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "suspendUntil", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "forward", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getRendering", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "release", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getTaskInstanceData", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getOutput", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "addAttachment", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "activate", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setFault", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nominate", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getAttachment", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getFault", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "getOutcome", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "instantiateSubtask", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> activateOrAddAttachmentOrAddComment;

    /**
     * Gets the value of the activateOrAddAttachmentOrAddComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activateOrAddAttachmentOrAddComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivateOrAddAttachmentOrAddComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TTaskOperation }{@code >}
     * 
     * 
     */
    public List<Object> getActivateOrAddAttachmentOrAddComment() {
        if (activateOrAddAttachmentOrAddComment == null) {
            activateOrAddAttachmentOrAddComment = new ArrayList<Object>();
        }
        return this.activateOrAddAttachmentOrAddComment;
    }

}
