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
    private boolean available;

    public Room(String name, Student student) {
        helperID++;
        this.roomID = helperID;
        this.name = name;
        this.student = student;
        this.available = false;
    }

    public Room() {
        helperID++;
        this.roomID = helperID;
        this.name = generateRandomName();
        this.available = true;
    }

    public Room(String name, boolean isAvailable) {
        helperID++;
        this.roomID = helperID;
        this.name = name;
        this.available = isAvailable;
    }

    private String generateRandomName() {
        List<String> nameList = new ArrayList<>(Set.of("Green", "Black", "White", "Purple", "Orange"));
        int randomNameIndex = random.nextInt(nameList.size());
        return nameList.get(randomNameIndex);
    }
}
