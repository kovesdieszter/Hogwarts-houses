package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.service.DAO.StudentMemory;
import org.springframework.stereotype.Component;

@Component
public class StudentCreator {
    private final StudentMemory studentMemory;

    public StudentCreator(StudentMemory studentMemory) {
        this.studentMemory = studentMemory;
        initializeStudents();
    }

    private void initializeStudents() {
        studentMemory.addStudent(new Student("Hermione Granger"));
        studentMemory.addStudent(new Student("Draco Malfoy"));
    }
}
