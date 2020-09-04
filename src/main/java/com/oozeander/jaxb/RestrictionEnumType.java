//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.09.04 à 11:16:54 AM CEST 
//


package com.oozeander.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour restrictionEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="restrictionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Developpeur"/>
 *     &lt;enumeration value="Architecte"/>
 *     &lt;enumeration value="Medecin"/>
 *     &lt;enumeration value="Pilote"/>
 *     &lt;enumeration value="President"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "restrictionEnum")
@XmlEnum
public enum RestrictionEnumType {

    @XmlEnumValue("Developpeur")
    DEVELOPPEUR("Developpeur"),
    @XmlEnumValue("Architecte")
    ARCHITECTE("Architecte"),
    @XmlEnumValue("Medecin")
    MEDECIN("Medecin"),
    @XmlEnumValue("Pilote")
    PILOTE("Pilote"),
    @XmlEnumValue("President")
    PRESIDENT("President");
    private final String value;

    RestrictionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestrictionEnumType fromValue(String v) {
        for (RestrictionEnumType c: RestrictionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
