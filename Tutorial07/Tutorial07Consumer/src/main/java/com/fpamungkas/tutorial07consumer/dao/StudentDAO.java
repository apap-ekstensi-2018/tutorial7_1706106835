package com.fpamungkas.tutorial07consumer.dao;

import java.util.List;

import com.fpamungkas.tutorial07consumer.model.StudentModel;

public interface StudentDAO {
	StudentModel selectStudent (String npm);
	List<StudentModel> selectAllStudents();
}
