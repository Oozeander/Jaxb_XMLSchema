//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.09.04 � 11:16:54 AM CEST 
//


package com.oozeander.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}personnes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personne1",
    "personne2",
    "personne3",
    "personne4",
    "personne5",
    "personne6",
    "personne7",
    "personne8"
})
@XmlRootElement(name = "personnes")
public class PersonnesElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PersonneAvecAttributType personne1;
    @XmlElement(required = true)
    protected PersonneAvecAttributEtValeurType personne2;
    @XmlElement(required = true)
    protected PersonneComplexeType personne3;
    @XmlElement(required = true)
    protected PersonneListeType personne4;
    @XmlElement(required = true)
    protected PersonneListeConcatType personne5;
    @XmlElement(required = true)
    protected PersonneChoiceType personne6;
    @XmlElement(required = true)
    protected PersonneNoOrderType personne7;
    @XmlElement(required = true)
    protected PersonneRestrictionType personne8;

    /**
     * Obtient la valeur de la propri�t� personne1.
     * 
     * @return
     *     possible object is
     *     {@link PersonneAvecAttributType }
     *     
     */
    public PersonneAvecAttributType getPersonne1() {
        return personne1;
    }

    /**
     * D�finit la valeur de la propri�t� personne1.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneAvecAttributType }
     *     
     */
    public void setPersonne1(PersonneAvecAttributType value) {
        this.personne1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne2.
     * 
     * @return
     *     possible object is
     *     {@link PersonneAvecAttributEtValeurType }
     *     
     */
    public PersonneAvecAttributEtValeurType getPersonne2() {
        return personne2;
    }

    /**
     * D�finit la valeur de la propri�t� personne2.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneAvecAttributEtValeurType }
     *     
     */
    public void setPersonne2(PersonneAvecAttributEtValeurType value) {
        this.personne2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne3.
     * 
     * @return
     *     possible object is
     *     {@link PersonneComplexeType }
     *     
     */
    public PersonneComplexeType getPersonne3() {
        return personne3;
    }

    /**
     * D�finit la valeur de la propri�t� personne3.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneComplexeType }
     *     
     */
    public void setPersonne3(PersonneComplexeType value) {
        this.personne3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne4.
     * 
     * @return
     *     possible object is
     *     {@link PersonneListeType }
     *     
     */
    public PersonneListeType getPersonne4() {
        return personne4;
    }

    /**
     * D�finit la valeur de la propri�t� personne4.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneListeType }
     *     
     */
    public void setPersonne4(PersonneListeType value) {
        this.personne4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne5.
     * 
     * @return
     *     possible object is
     *     {@link PersonneListeConcatType }
     *     
     */
    public PersonneListeConcatType getPersonne5() {
        return personne5;
    }

    /**
     * D�finit la valeur de la propri�t� personne5.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneListeConcatType }
     *     
     */
    public void setPersonne5(PersonneListeConcatType value) {
        this.personne5 = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne6.
     * 
     * @return
     *     possible object is
     *     {@link PersonneChoiceType }
     *     
     */
    public PersonneChoiceType getPersonne6() {
        return personne6;
    }

    /**
     * D�finit la valeur de la propri�t� personne6.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneChoiceType }
     *     
     */
    public void setPersonne6(PersonneChoiceType value) {
        this.personne6 = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne7.
     * 
     * @return
     *     possible object is
     *     {@link PersonneNoOrderType }
     *     
     */
    public PersonneNoOrderType getPersonne7() {
        return personne7;
    }

    /**
     * D�finit la valeur de la propri�t� personne7.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneNoOrderType }
     *     
     */
    public void setPersonne7(PersonneNoOrderType value) {
        this.personne7 = value;
    }

    /**
     * Obtient la valeur de la propri�t� personne8.
     * 
     * @return
     *     possible object is
     *     {@link PersonneRestrictionType }
     *     
     */
    public PersonneRestrictionType getPersonne8() {
        return personne8;
    }

    /**
     * D�finit la valeur de la propri�t� personne8.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneRestrictionType }
     *     
     */
    public void setPersonne8(PersonneRestrictionType value) {
        this.personne8 = value;
    }

}
