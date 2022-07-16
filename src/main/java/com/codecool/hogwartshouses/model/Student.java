package com.codecool.hogwartshouses.model;

import com.codecool.hogwartshouses.model.types.PetType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
public class Student {

    private String name;
    private PetType petType;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, PetType petType) {
        this.name = name;
        this.petType = petType;
    }
}
