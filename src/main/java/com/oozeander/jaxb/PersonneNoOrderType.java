//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.09.04 � 11:16:54 AM CEST 
//


package com.oozeander.jaxb;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour personneNoOrder complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="personneNoOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nomEtPrenom" type="{}nomEtPrenom"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personneNoOrder", propOrder = {

})
public class PersonneNoOrderType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected NomEtPrenomType nomEtPrenom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date date;

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

    /**
     * Obtient la valeur de la propri�t� date.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * D�finit la valeur de la propri�t� date.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

}
