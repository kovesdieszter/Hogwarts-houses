package com.codecool.hogwartshouses.model;

import lombok.Data;
import lombok.ToString;

import java.util.*;


@ToString
@Data
public class Room {
    Random random = new Random();
    private static int helperID = 0;
    private final int roomID;
    private String name;

    private Student student;
    private boolean isAvailable;

    public Room(String name, Student student) {
        helperID++;
        this.roomID = helperID;
        this.name = name;
        this.student = student;
        this.isAvailable = false;
    }

    public Room() {
        helperID++;
        this.roomID = helperID;
        this.name = generateRandomName();
        this.isAvailable = true;
    }

    public Room(String name, boolean isAvailable) {
        helperID++;
        this.roomID = helperID;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    private String generateRandomName() {
        List<String> nameList = new ArrayList<>(Set.of("Green", "Black", "White", "Purple", "Orange"));
        int randomNameIndex = random.nextInt(nameList.size());
        return nameList.get(randomNameIndex);
    }
}
