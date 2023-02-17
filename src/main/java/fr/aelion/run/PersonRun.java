package fr.aelion.run;

import fr.aelion.models.Person;

/**
 * @name PersonRun
 * Make some Person instances and make each say hello
 */

public class PersonRun {
    public void run(){

        Person jl = new Person();
        jl.setLastName("Lelievre");
        jl.setFirstName("jimm");
        jl.setPhoneNumber("05 11 11 11");
        jl.setEmail("Lelievre@jkqdsj.fr");

        System.out.println("Bonjour je m'appelle " +jl.greetings());

        Person jt = new Person();
        jt.setLastName("tutu");
        jt.setFirstName("jean");
        jt.setPhoneNumber("05 11 11 11");
        jt.setEmail("qsd@jkqdsj.fr");

        System.out.println("Bonjour je m'appelle " + jt.greetings());

        Person mel = new Person("tutu","melanie", "05 11 11 11", "dfsfs@gmail.com");
        System.out.println("Bonjour je m'appelle " + mel.greetings());

        Person bond = new Person("Bond", "kjhfusdhf@sd.fr");
        System.out.println("Bonjour je m'appelle " + bond.greetings());
    }
}
