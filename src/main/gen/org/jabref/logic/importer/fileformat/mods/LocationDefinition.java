//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.27 at 04:51:38 PM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}physicalLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}shelfLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}url" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}holdingSimple" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/mods/v3}holdingExternal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}languageAttributeGroup"/>
 *       &lt;attribute name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="altRepGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationDefinition", namespace = "http://www.loc.gov/mods/v3", propOrder = {
    "physicalLocation",
    "shelfLocator",
    "url",
    "holdingSimple",
    "holdingExternal"
})
public class LocationDefinition {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<PhysicalLocationDefinition> physicalLocation;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<StringPlusLanguage> shelfLocator;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<UrlDefinition> url;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected HoldingSimpleDefinition holdingSimple;
    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected ExtensionDefinition holdingExternal;
    @XmlAttribute(name = "displayLabel")
    protected String displayLabel;
    @XmlAttribute(name = "altRepGroup")
    protected String altRepGroup;
    @XmlAttribute(name = "lang")
    protected String atlang;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "script")
    protected String script;
    @XmlAttribute(name = "transliteration")
    protected String transliteration;

    /**
     * Gets the value of the physicalLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalLocationDefinition }
     * 
     * 
     */
    public List<PhysicalLocationDefinition> getPhysicalLocation() {
        if (physicalLocation == null) {
            physicalLocation = new ArrayList<PhysicalLocationDefinition>();
        }
        return this.physicalLocation;
    }

    /**
     * Gets the value of the shelfLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shelfLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShelfLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusLanguage }
     * 
     * 
     */
    public List<StringPlusLanguage> getShelfLocator() {
        if (shelfLocator == null) {
            shelfLocator = new ArrayList<StringPlusLanguage>();
        }
        return this.shelfLocator;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlDefinition }
     * 
     * 
     */
    public List<UrlDefinition> getUrl() {
        if (url == null) {
            url = new ArrayList<UrlDefinition>();
        }
        return this.url;
    }

    /**
     * Gets the value of the holdingSimple property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingSimpleDefinition }
     *     
     */
    public HoldingSimpleDefinition getHoldingSimple() {
        return holdingSimple;
    }

    /**
     * Sets the value of the holdingSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingSimpleDefinition }
     *     
     */
    public void setHoldingSimple(HoldingSimpleDefinition value) {
        this.holdingSimple = value;
    }

    /**
     * Gets the value of the holdingExternal property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDefinition }
     *     
     */
    public ExtensionDefinition getHoldingExternal() {
        return holdingExternal;
    }

    /**
     * Sets the value of the holdingExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDefinition }
     *     
     */
    public void setHoldingExternal(ExtensionDefinition value) {
        this.holdingExternal = value;
    }

    /**
     * Gets the value of the displayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabel() {
        return displayLabel;
    }

    /**
     * Sets the value of the displayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabel(String value) {
        this.displayLabel = value;
    }

    /**
     * Gets the value of the altRepGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltRepGroup() {
        return altRepGroup;
    }

    /**
     * Sets the value of the altRepGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltRepGroup(String value) {
        this.altRepGroup = value;
    }

    /**
     * Gets the value of the atlang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtlang() {
        return atlang;
    }

    /**
     * Sets the value of the atlang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtlang(String value) {
        this.atlang = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteration(String value) {
        this.transliteration = value;
    }

}
