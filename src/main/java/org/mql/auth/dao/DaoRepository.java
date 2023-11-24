package org.mql.auth.dao;

import org.mql.auth.models.Student;

import java.util.List;
import java.util.Optional;

public interface DaoRepository {

    public List<Student> getStudents();

    public Optional<Student> getStudent(String name, String password);
}
