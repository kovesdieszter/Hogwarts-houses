package com.codecool.hogwartshouses.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }
}
