package fr.aelion.repositories;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
   public List<Student> students = new ArrayList<>();
    public StudentRepository() {
        this.populate();
    }

    private void populate(){
        // make an instance of student
        Student student = new Student("lelievre", "jimmy", "jimmy@hotmail.fr");
        student.setUsername("jim");
        student.setPassword("dfdf");

        // Add student to list
        this.students.add(student);
    }
}
