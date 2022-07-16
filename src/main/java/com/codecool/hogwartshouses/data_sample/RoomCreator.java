package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.DAO.RoomMemory;
import org.springframework.stereotype.Component;


@Component
public class RoomCreator {

    private final RoomMemory roomMemory;

    public RoomCreator(RoomMemory roomMemory) {
        this.roomMemory = roomMemory;
        initialize();
    }

    public void initialize() {
        roomMemory.addRoom(new Room("Green"));
        roomMemory.addRoom(new Room("Red"));
        roomMemory.addRoom(new Room("Red"));
    }

}
