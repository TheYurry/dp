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
 *         &lt;element ref="{}id"/>
 *         &lt;element name="type" type="{}arc_type"/>
 *         &lt;element ref="{}sourceId"/>
 *         &lt;element ref="{}destinationId"/>
 *         &lt;element ref="{}multiplicity"/>
 *         &lt;element ref="{}breakPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "type",
        "sourceId",
        "destinationId",
        "multiplicity",
        "breakPoint"
})
@XmlRootElement(name = "arc")
public class Arc {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, defaultValue = "regular")
    @XmlSchemaType(name = "string")
    protected ArcType type;
    @XmlElement(required = true)
    protected String sourceId;
    @XmlElement(required = true)
    protected String destinationId;
    protected int multiplicity;
    protected List<BreakPoint> breakPoint;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link ArcType }
     */
    public ArcType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link ArcType }
     */
    public void setType(ArcType value) {
        this.type = value;
    }

    /**
     * Gets the value of the sourceId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the destinationId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * Sets the value of the destinationId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDestinationId(String value) {
        this.destinationId = value;
    }

    /**
     * Gets the value of the multiplicity property.
     */
    public int getMultiplicity() {
        return multiplicity;
    }

    /**
     * Sets the value of the multiplicity property.
     */
    public void setMultiplicity(int value) {
        this.multiplicity = value;
    }

    /**
     * Gets the value of the breakPoint property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakPoint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakPoint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakPoint }
     */
    public List<BreakPoint> getBreakPoint() {
        if (breakPoint == null) {
            breakPoint = new ArrayList<BreakPoint>();
        }
        return this.breakPoint;
    }

}
