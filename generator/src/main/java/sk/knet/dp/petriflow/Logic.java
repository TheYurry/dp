package sk.knet.dp.petriflow;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}perform" minOccurs="0"/>
 *         &lt;element ref="{}delegate" minOccurs="0"/>
 *         &lt;element ref="{}view" minOccurs="0"/>
 *         &lt;element name="behavior" type="{}behavior" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}action" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}actionRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "perform",
        "delegate",
        "view",
        "behavior",
        "action",
        "actionRef"
})
@XmlRootElement(name = "logic")
public class Logic {

    protected Boolean perform = false;
    protected Boolean delegate = false;
    protected Boolean view = false;
    @XmlSchemaType(name = "string")
    protected List<Behavior> behavior;
    protected List<ActionType> action;
    protected List<ActionRefType> actionRef;

    /**
     * Gets the value of the perform property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPerform() {
        return perform;
    }

    /**
     * Sets the value of the perform property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPerform(Boolean value) {
        this.perform = value;
    }

    /**
     * Gets the value of the delegate property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDelegate() {
        return delegate;
    }

    /**
     * Sets the value of the delegate property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDelegate(Boolean value) {
        this.delegate = value;
    }

    /**
     * Gets the value of the view property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setView(Boolean value) {
        this.view = value;
    }

    /**
     * Gets the value of the behavior property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the behavior property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBehavior().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Behavior }
     */
    public List<Behavior> getBehavior() {
        if (behavior == null) {
            behavior = new ArrayList<Behavior>();
        }
        return this.behavior;
    }

    /**
     * Gets the value of the action property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     */
    public List<ActionType> getAction() {
        if (action == null) {
            action = new ArrayList<ActionType>();
        }
        return this.action;
    }

    /**
     * Gets the value of the actionRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionRefType }
     */
    public List<ActionRefType> getActionRef() {
        if (actionRef == null) {
            actionRef = new ArrayList<ActionRefType>();
        }
        return this.actionRef;
    }

}
