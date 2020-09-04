//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.04 à 11:16:54 AM CEST 
//


package com.oozeander.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour personneListe2 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="personneListe2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomComplet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="skills" type="{}list"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personneListe2", propOrder = {
    "nomComplet",
    "skills"
})
public class PersonneListeConcatType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String nomComplet;
    @XmlList
    @XmlElement(required = true)
    protected List<String> skills;

    /**
     * Obtient la valeur de la propriété nomComplet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomComplet() {
        return nomComplet;
    }

    /**
     * Définit la valeur de la propriété nomComplet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomComplet(String value) {
        this.nomComplet = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skills property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkills().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSkills() {
        if (skills == null) {
            skills = new ArrayList<String>();
        }
        return this.skills;
    }

}
