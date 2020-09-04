//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.09.04 � 11:16:54 AM CEST 
//


package com.oozeander.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour personneRestriction complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="personneRestriction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="initial">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Z][A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="anneeDeNaissance" type="{}restrictionAnneeEntreMinEtMax"/>
 *         &lt;element name="profession" type="{}restrictionEnum"/>
 *         &lt;element name="motDePasse">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="id">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *             &lt;pattern value="[0-9][0-9][0-9][0-9]"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personneRestriction", propOrder = {

})
public class PersonneRestrictionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String initial;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    protected BigInteger anneeDeNaissance;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RestrictionEnumType profession;
    @XmlElement(required = true)
    protected String motDePasse;
    @XmlAttribute(name = "id")
    protected BigInteger id;

    /**
     * Obtient la valeur de la propri�t� initial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitial() {
        return initial;
    }

    /**
     * D�finit la valeur de la propri�t� initial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitial(String value) {
        this.initial = value;
    }

    /**
     * Obtient la valeur de la propri�t� anneeDeNaissance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnneeDeNaissance() {
        return anneeDeNaissance;
    }

    /**
     * D�finit la valeur de la propri�t� anneeDeNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnneeDeNaissance(BigInteger value) {
        this.anneeDeNaissance = value;
    }

    /**
     * Obtient la valeur de la propri�t� profession.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionEnumType }
     *     
     */
    public RestrictionEnumType getProfession() {
        return profession;
    }

    /**
     * D�finit la valeur de la propri�t� profession.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionEnumType }
     *     
     */
    public void setProfession(RestrictionEnumType value) {
        this.profession = value;
    }

    /**
     * Obtient la valeur de la propri�t� motDePasse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * D�finit la valeur de la propri�t� motDePasse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotDePasse(String value) {
        this.motDePasse = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
