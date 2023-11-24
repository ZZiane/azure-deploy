package org.mql.auth.dao;

import org.mql.auth.models.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class DatabaseInMemory implements DaoRepository{

    private static List<Student> students = new Vector<>();


    static{

        students.addAll(Arrays.asList(
               new Student("Khezami","root",10),
               new Student("Fadil","root",11),
               new Student("Ziane","root",10),
               new Student("Ouchta","root",12)

                ));

    }


    public List<Student> getStudents() {
        return students;
    }

    public Optional<Student> getStudent(String name, String password) {
        return students.stream().filter((s)-> (s.getName().toLowerCase().equals( name.toLowerCase() ))&& s.getPassword().equals(password)).findFirst();
    }
}
