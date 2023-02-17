package fr.aelion.run;

import fr.aelion.models.Student;

public class StudentRun {
    public void run(){
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
            System.out.println("Désolé mais uncun utilisateur ne correspond a ces identifiants");
        }
    }
}
