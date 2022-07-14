package com.codecool.hogwartshouses.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.UUID;

@Data
@ToString
//@NoArgsConstructor
//@Builder
public class Room {
    private static int helperID = 0;
    private int roomID;

    public Room() {
        helperID++;
        this.roomID = helperID;
    }
}
