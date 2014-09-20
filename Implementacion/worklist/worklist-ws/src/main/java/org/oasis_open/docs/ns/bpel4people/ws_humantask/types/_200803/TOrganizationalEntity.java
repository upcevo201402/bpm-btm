
package org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tOrganizationalEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOrganizationalEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="user" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tUser"/>
 *         &lt;element name="group" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tGroup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOrganizationalEntity", propOrder = {
    "userOrGroup"
})
public class TOrganizationalEntity {

    @XmlElementRefs({
        @XmlElementRef(name = "group", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "user", namespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> userOrGroup;

    /**
     * Gets the value of the userOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getUserOrGroup() {
        if (userOrGroup == null) {
            userOrGroup = new ArrayList<JAXBElement<String>>();
        }
        return this.userOrGroup;
    }

}
