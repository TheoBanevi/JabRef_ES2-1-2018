//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.09 at 08:42:29 PM BRT 
//


package org.jabref.logic.importer.fileformat.mods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citySectionDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citySectionDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>hierarchicalPart">
 *       &lt;attribute name="citySectionType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citySectionDefinition", namespace = "http://www.loc.gov/mods/v3")
public class CitySectionDefinition
    extends HierarchicalPart
{

    @XmlAttribute(name = "citySectionType")
    @XmlSchemaType(name = "anySimpleType")
    protected String citySectionType;

    /**
     * Gets the value of the citySectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitySectionType() {
        return citySectionType;
    }

    /**
     * Sets the value of the citySectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitySectionType(String value) {
        this.citySectionType = value;
    }

}
