package com.codecool.hogwartshouses.service.DAO;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.types.PetType;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class RoomMemory implements RoomDAO {

    private Set<Room> rooms;

    public RoomMemory(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public Set<Room> getRooms() {
        return rooms;
    }

    @Override
    public void addRoom() {
        rooms.add(new Room());
    }

    @Override
    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public Room getRoom(int roomID) {
        return rooms.stream().filter(room -> room.getRoomID() == roomID).collect(Collectors.toList()).get(0);
    }

    @Override
    public void deleteRoom(int roomID) {
        rooms.removeIf(room -> room.getRoomID() == roomID);
    }

    @Override
    public void updateRoom(int roomID, Room updatedRoom) {
        rooms.stream().filter(room -> room.getRoomID() == roomID)
                .findFirst()
                .ifPresent(room -> room.setName(updatedRoom.getName()));
    }

    @Override
    public Set<Room> getAvailableRooms() {
        return rooms.stream().filter(Room::isAvailable)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Room> getRoomsWithRatOwners() {
        return rooms.stream().filter(room -> room.getStudent().getPetType() == PetType.RAT)
                .collect(Collectors.toSet());
    }


}
