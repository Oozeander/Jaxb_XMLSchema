//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.04 à 11:16:54 AM CEST 
//


package com.oozeander.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oozeander.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Personne6_QNAME = new QName("", "personne6");
    private final static QName _Personne7_QNAME = new QName("", "personne7");
    private final static QName _Personne4_QNAME = new QName("", "personne4");
    private final static QName _Personne5_QNAME = new QName("", "personne5");
    private final static QName _Personne8_QNAME = new QName("", "personne8");
    private final static QName _Personne2_QNAME = new QName("", "personne2");
    private final static QName _Personne3_QNAME = new QName("", "personne3");
    private final static QName _Personne1_QNAME = new QName("", "personne1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oozeander.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonneListeType }
     * 
     */
    public PersonneListeType createPersonneListeType() {
        return new PersonneListeType();
    }

    /**
     * Create an instance of {@link PersonneChoiceType }
     * 
     */
    public PersonneChoiceType createPersonneChoiceType() {
        return new PersonneChoiceType();
    }

    /**
     * Create an instance of {@link PersonneNoOrderType }
     * 
     */
    public PersonneNoOrderType createPersonneNoOrderType() {
        return new PersonneNoOrderType();
    }

    /**
     * Create an instance of {@link PersonneListeConcatType }
     * 
     */
    public PersonneListeConcatType createPersonneListeConcatType() {
        return new PersonneListeConcatType();
    }

    /**
     * Create an instance of {@link PersonneRestrictionType }
     * 
     */
    public PersonneRestrictionType createPersonneRestrictionType() {
        return new PersonneRestrictionType();
    }

    /**
     * Create an instance of {@link PersonneAvecAttributEtValeurType }
     * 
     */
    public PersonneAvecAttributEtValeurType createPersonneAvecAttributEtValeurType() {
        return new PersonneAvecAttributEtValeurType();
    }

    /**
     * Create an instance of {@link PersonnesElement }
     * 
     */
    public PersonnesElement createPersonnesElement() {
        return new PersonnesElement();
    }

    /**
     * Create an instance of {@link PersonneAvecAttributType }
     * 
     */
    public PersonneAvecAttributType createPersonneAvecAttributType() {
        return new PersonneAvecAttributType();
    }

    /**
     * Create an instance of {@link PersonneComplexeType }
     * 
     */
    public PersonneComplexeType createPersonneComplexeType() {
        return new PersonneComplexeType();
    }

    /**
     * Create an instance of {@link NomEtPrenomType }
     * 
     */
    public NomEtPrenomType createNomEtPrenomType() {
        return new NomEtPrenomType();
    }

    /**
     * Create an instance of {@link PersonneListeType.Skills }
     * 
     */
    public PersonneListeType.Skills createPersonneListeTypeSkills() {
        return new PersonneListeType.Skills();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne6")
    public JAXBElement<PersonneChoiceType> createPersonne6(PersonneChoiceType value) {
        return new JAXBElement<PersonneChoiceType>(_Personne6_QNAME, PersonneChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneNoOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne7")
    public JAXBElement<PersonneNoOrderType> createPersonne7(PersonneNoOrderType value) {
        return new JAXBElement<PersonneNoOrderType>(_Personne7_QNAME, PersonneNoOrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneListeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne4")
    public JAXBElement<PersonneListeType> createPersonne4(PersonneListeType value) {
        return new JAXBElement<PersonneListeType>(_Personne4_QNAME, PersonneListeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneListeConcatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne5")
    public JAXBElement<PersonneListeConcatType> createPersonne5(PersonneListeConcatType value) {
        return new JAXBElement<PersonneListeConcatType>(_Personne5_QNAME, PersonneListeConcatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneRestrictionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne8")
    public JAXBElement<PersonneRestrictionType> createPersonne8(PersonneRestrictionType value) {
        return new JAXBElement<PersonneRestrictionType>(_Personne8_QNAME, PersonneRestrictionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneAvecAttributEtValeurType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne2")
    public JAXBElement<PersonneAvecAttributEtValeurType> createPersonne2(PersonneAvecAttributEtValeurType value) {
        return new JAXBElement<PersonneAvecAttributEtValeurType>(_Personne2_QNAME, PersonneAvecAttributEtValeurType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneComplexeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne3")
    public JAXBElement<PersonneComplexeType> createPersonne3(PersonneComplexeType value) {
        return new JAXBElement<PersonneComplexeType>(_Personne3_QNAME, PersonneComplexeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonneAvecAttributType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personne1")
    public JAXBElement<PersonneAvecAttributType> createPersonne1(PersonneAvecAttributType value) {
        return new JAXBElement<PersonneAvecAttributType>(_Personne1_QNAME, PersonneAvecAttributType.class, null, value);
    }

}
