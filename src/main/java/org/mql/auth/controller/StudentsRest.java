package org.mql.auth.controller;


import com.azure.core.annotation.Get;
import org.mql.auth.dao.DatabaseInMemory;
import org.mql.auth.models.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentsRest {

    private static DatabaseInMemory db = new DatabaseInMemory();


    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return db.getStudents();
    }



    @PostMapping("/login")
    public ResponseEntity<Student> getStudent(@RequestParam("username") String username, @RequestParam("password") String password){
        Optional<Student> student = db.getStudent(username, password);
        return  ResponseEntity.of(student);
    }

}
