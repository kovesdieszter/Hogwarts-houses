package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;

import java.util.Set;

public interface RoomDAO {

    Set<Room> getRooms();

    void addRoom();
    void addRoom(Room room);

    Room getRoom(int roomID);

    void deleteRoom(int roomID);

    void updateRoom(int roomID, Room updatedRoom);
    Set<Room> getAvailableRooms();

}