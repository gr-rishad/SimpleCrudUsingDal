package com.rishad.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.rishad.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
