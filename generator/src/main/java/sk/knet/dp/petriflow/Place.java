package sk.knet.dp.petriflow;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{}x"/>
 *         &lt;element ref="{}y"/>
 *         &lt;element ref="{}label"/>
 *         &lt;element ref="{}tokens"/>
 *         &lt;choice>
 *           &lt;element ref="{}isStatic"/>
 *           &lt;element ref="{}static"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "x",
        "y",
        "label",
        "tokens",
        "isStatic",
        "_static"
})
@XmlRootElement(name = "place")
public class Place {

    @XmlElement(required = true)
    protected String id;
    protected short x;
    protected short y;
    @XmlElement(required = true)
    protected I18NStringType label;
    protected int tokens;
    protected Boolean isStatic;
    @XmlElement(name = "static")
    protected Boolean _static;

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
     * Gets the value of the x property.
     */
    public short getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     */
    public void setX(short value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     */
    public short getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     */
    public void setY(short value) {
        this.y = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link I18NStringType }
     */
    public I18NStringType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link I18NStringType }
     */
    public void setLabel(I18NStringType value) {
        this.label = value;
    }

    /**
     * Gets the value of the tokens property.
     */
    public int getTokens() {
        return tokens;
    }

    /**
     * Sets the value of the tokens property.
     */
    public void setTokens(int value) {
        this.tokens = value;
    }

    /**
     * Gets the value of the isStatic property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsStatic() {
        return isStatic;
    }

    /**
     * Sets the value of the isStatic property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsStatic(Boolean value) {
        this.isStatic = value;
    }

    /**
     * Gets the value of the static property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStatic() {
        return _static;
    }

    /**
     * Sets the value of the static property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStatic(Boolean value) {
        this._static = value;
    }

}
