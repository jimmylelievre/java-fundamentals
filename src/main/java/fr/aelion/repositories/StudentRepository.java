package fr.aelion.repositories;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
   private List<Student> students = new ArrayList<>();
    public StudentRepository() {
        this.populate();
    }

    public Student findByLoginAndPassword(String login, String password){
        for (Student student : this.students){
            if (student.getUsername().equals(login ) && student.getPassword().equals(password) ){

                return student;
            }
        }
        return null;
    }
    public int size(){
        return this.students.size();
    }

    private void populate(){
        // make an instance of student
        Student student = new Student("lelievre", "jimmy", "jimmy@hotmail.fr");
        student.setUsername("bond");
        student.setPassword("007");

        // Add student to list
        this.students.add(student);
    }
}
