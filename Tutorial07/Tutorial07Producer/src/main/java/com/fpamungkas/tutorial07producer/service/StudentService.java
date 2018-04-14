package com.fpamungkas.tutorial07producer.service;

import java.util.List;

import com.fpamungkas.tutorial07producer.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);


    List<StudentModel> selectAllStudents ();


    void addStudent (StudentModel student);


    void deleteStudent (String npm);

    void updateStudent (StudentModel student);
}
