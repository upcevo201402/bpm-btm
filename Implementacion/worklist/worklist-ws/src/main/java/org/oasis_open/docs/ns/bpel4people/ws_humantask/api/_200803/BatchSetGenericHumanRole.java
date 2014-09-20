
package org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TOrganizationalEntity;


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
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="genericHumanRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organizationalEntity" type="{http://docs.oasis-open.org/ns/bpel4people/ws-humantask/types/200803}tOrganizationalEntity"/>
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
    "genericHumanRole",
    "organizationalEntity"
})
@XmlRootElement(name = "batchSetGenericHumanRole")
public class BatchSetGenericHumanRole {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> identifier;
    @XmlElement(required = true)
    protected String genericHumanRole;
    @XmlElement(required = true)
    protected TOrganizationalEntity organizationalEntity;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<String>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the genericHumanRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericHumanRole() {
        return genericHumanRole;
    }

    /**
     * Sets the value of the genericHumanRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericHumanRole(String value) {
        this.genericHumanRole = value;
    }

    /**
     * Gets the value of the organizationalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public TOrganizationalEntity getOrganizationalEntity() {
        return organizationalEntity;
    }

    /**
     * Sets the value of the organizationalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOrganizationalEntity }
     *     
     */
    public void setOrganizationalEntity(TOrganizationalEntity value) {
        this.organizationalEntity = value;
    }

}
