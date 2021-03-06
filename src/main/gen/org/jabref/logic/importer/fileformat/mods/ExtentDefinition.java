//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.12 at 06:37:39 PM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extentDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extentDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}start" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}end" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}total" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}list" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extentDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "start",
    "end",
    "total",
    "list"
})
public class ExtentDefinition {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected StringPlusLanguage start;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected StringPlusLanguage end;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger total;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected StringPlusLanguage list;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusLanguage }
     *     
     */
    public StringPlusLanguage getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusLanguage }
     *     
     */
    public void setStart(StringPlusLanguage value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusLanguage }
     *     
     */
    public StringPlusLanguage getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusLanguage }
     *     
     */
    public void setEnd(StringPlusLanguage value) {
        this.end = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusLanguage }
     *     
     */
    public StringPlusLanguage getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusLanguage }
     *     
     */
    public void setList(StringPlusLanguage value) {
        this.list = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
