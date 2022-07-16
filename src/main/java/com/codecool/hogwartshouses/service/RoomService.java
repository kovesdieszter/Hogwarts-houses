package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.DAO.RoomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoomService {

    @Autowired
    private RoomDAO roomDAO;

    public Set<Room> getRooms() {
        return roomDAO.getRooms();
    }

    public Object addRoom() {
        roomDAO.addRoom();
        return null;
    }

    public Room getRoom(int roomID){
        return roomDAO.getRoom(roomID);
    }
}
