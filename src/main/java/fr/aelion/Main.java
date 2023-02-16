package fr.aelion;

import fr.aelion.models.Person;
import fr.aelion.models.Student;

public class Main {
    private static Main app;

    public static void main(String[] args) {

        app = new Main();
        System.out.println("I'm the main method");
    }

    public Main() {
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

    public Main(String name) {
        System.out.println("Hello " + name);
    }

    public void userLife(){
        Student student = new Student("lelievre", "jimmy", "jimmy@hotmail.fr");
        student.setUsername("jim");
        student.setPassword("dfdf");
        if(student.isLoggedIn() == false){
            if (student.login("jim", "dfdf")){
                System.out.println("Bonjour" + student.firstName + " " + student.lastName);
            }else{
                System.out.println("Désolé aucun utilisateur ne correspond");
            }
        }

        if(student.isLoggedIn()){
            student.logout();

        }
        if (!student.login("toto","titi")){
            System.out.println("Désoolé mais uncun utilisateur ne correspond a ces identifiants");
        }

    }

}