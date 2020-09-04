package com.oozeander;

import com.oozeander.jaxb.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;

public class App {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(PersonnesElement.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "com/oozeander/xsd/personnes.xsd");

        PersonnesElement personnes = new PersonnesElement();
        personnes.setPersonne1(new PersonneAvecAttributType());
        personnes.getPersonne1().setValue("Billel");

        personnes.setPersonne2(new PersonneAvecAttributEtValeurType());
        personnes.getPersonne2().setId(BigInteger.ONE);
        personnes.getPersonne2().setValue("Billel");

        personnes.setPersonne3(new PersonneComplexeType());
        personnes.getPersonne3().setId(BigInteger.ONE);
        personnes.getPersonne3().setNom("KETROUCI");
        personnes.getPersonne3().setPrenom("Billel");

        personnes.setPersonne4(new PersonneListeType());
        personnes.getPersonne4().setNomComplet("Billel KETROUCI");
        PersonneListeType.Skills skills = new PersonneListeType.Skills();
        skills.getSkill().addAll(Arrays.asList("Java", "Hibernate", "Spring", "Angular"));
        personnes.getPersonne4().setSkills(skills);

        personnes.setPersonne5(new PersonneListeConcatType());
        personnes.getPersonne5().setNomComplet("Billel KETROUCI");
        personnes.getPersonne5().getSkills().addAll(Arrays.asList("Java", "Hibernate", "Spring", "Angular"));

        personnes.setPersonne6(new PersonneChoiceType());
        personnes.getPersonne6().setNomComplet("Billel KETROUCI");
        NomEtPrenomType nomEtPrenom = new NomEtPrenomType();
        nomEtPrenom.setNom("KETROUCI"); nomEtPrenom.setPrenom("Billel");
        //personnes.getPersonne6().setNomEtPrenom(nomEtPrenom);

        personnes.setPersonne7(new PersonneNoOrderType());
        personnes.getPersonne7().setDate(new Date());
        personnes.getPersonne7().setNomEtPrenom(nomEtPrenom);

        personnes.setPersonne8(new PersonneRestrictionType());
        personnes.getPersonne8().setId(BigInteger.valueOf(1170));
        personnes.getPersonne8().setAnneeDeNaissance(BigInteger.valueOf(1996));
        personnes.getPersonne8().setInitial("BK");
        personnes.getPersonne8().setMotDePasse("monMotDePasse");
        personnes.getPersonne8().setProfession(RestrictionEnumType.DEVELOPPEUR);

        marshaller.marshal(personnes, new File("src/main/resources/personnes-generated.xml"));

        /*
        XJC : xjc -b [binding file] -d [directory] -p [package] xsd
        Exemple : xjc -b src\main\resources\global.xjb
                      -d src\main\java
                      -p com.oozeander.jaxb src\main\resources\com\oozeander\xsd\personnes.xsd
        */
    }
}