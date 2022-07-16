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

    public Room() {
        helperID++;
        this.roomID = helperID;
        this.name = generateRandomName();
    }

    public Room(String name) {
        this.roomID = helperID;
        this.name = name;
    }

    private String generateRandomName() {
        List<String> nameList = new ArrayList<>(Set.of("Green", "Black", "White", "Purple", "Orange"));
        int randomNameIndex = random.nextInt(nameList.size());
        return nameList.get(randomNameIndex);
    }
}
