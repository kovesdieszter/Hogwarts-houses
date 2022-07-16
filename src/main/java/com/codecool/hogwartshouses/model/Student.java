package com.codecool.hogwartshouses.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }
}
