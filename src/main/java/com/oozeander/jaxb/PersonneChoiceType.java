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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour personneChoice complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="personneChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="nomComplet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="nomEtPrenom" type="{}nomEtPrenom"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personneChoice", propOrder = {
    "nomComplet",
    "nomEtPrenom"
})
public class PersonneChoiceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String nomComplet;
    protected NomEtPrenomType nomEtPrenom;

    /**
     * Obtient la valeur de la propri�t� nomComplet.
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
     * D�finit la valeur de la propri�t� nomComplet.
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
     * Obtient la valeur de la propri�t� nomEtPrenom.
     * 
     * @return
     *     possible object is
     *     {@link NomEtPrenomType }
     *     
     */
    public NomEtPrenomType getNomEtPrenom() {
        return nomEtPrenom;
    }

    /**
     * D�finit la valeur de la propri�t� nomEtPrenom.
     * 
     * @param value
     *     allowed object is
     *     {@link NomEtPrenomType }
     *     
     */
    public void setNomEtPrenom(NomEtPrenomType value) {
        this.nomEtPrenom = value;
    }

}
