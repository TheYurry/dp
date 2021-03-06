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
 *         &lt;element ref="{}title" minOccurs="0"/>
 *         &lt;element ref="{}alignment" minOccurs="0"/>
 *         &lt;element ref="{}stretch" minOccurs="0"/>
 *         &lt;element ref="{}dataRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "title",
        "alignment",
        "stretch",
        "dataRef"
})
@XmlRootElement(name = "dataGroup")
public class DataGroup {

    @XmlElement(required = true)
    protected String id;
    protected I18NStringType title;
    @XmlSchemaType(name = "string")
    protected DataGroupAlignment alignment;
    protected Boolean stretch;
    protected List<DataRef> dataRef;

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
     * Gets the value of the title property.
     *
     * @return possible object is
     * {@link I18NStringType }
     */
    public I18NStringType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link I18NStringType }
     */
    public void setTitle(I18NStringType value) {
        this.title = value;
    }

    /**
     * Gets the value of the alignment property.
     *
     * @return possible object is
     * {@link DataGroupAlignment }
     */
    public DataGroupAlignment getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     *
     * @param value allowed object is
     *              {@link DataGroupAlignment }
     */
    public void setAlignment(DataGroupAlignment value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the stretch property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStretch() {
        return stretch;
    }

    /**
     * Sets the value of the stretch property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStretch(Boolean value) {
        this.stretch = value;
    }

    /**
     * Gets the value of the dataRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRef }
     */
    public List<DataRef> getDataRef() {
        if (dataRef == null) {
            dataRef = new ArrayList<DataRef>();
        }
        return this.dataRef;
    }

}
