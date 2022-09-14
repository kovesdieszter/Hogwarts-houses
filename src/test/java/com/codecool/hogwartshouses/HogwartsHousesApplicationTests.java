package com.codecool.hogwartshouses;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.DAO.RoomMemory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HogwartsHousesApplicationTests {

	private Set<Room> testRooms = new HashSet<>();
	private RoomMemory roomMemory = new RoomMemory(testRooms);


	@Test
	void getRoomsTest(){
		assertEquals(roomMemory.getRooms().size(), testRooms.size());
	}

	@Test
	void getRoomByIdTest() {
		Room testRoom = new Room("Purple", true);
		roomMemory.addRoom(testRoom);
		System.out.println(roomMemory.getRooms());
		assertEquals(roomMemory.getRoom(7), testRoom);
	}

	@Test
	void addRoomTest(){
		testRooms.add(new Room());
		roomMemory.addRoom();
		assertEquals(roomMemory.getRooms().size(), testRooms.size());
	}

	@Test
	void deleteRoomTest(){
		testRooms.add(new Room("Green", true));
		testRooms.removeIf(room -> Objects.equals(room.getName(), "Green"));
		roomMemory.deleteRoom(1);
		assertEquals(roomMemory.getRooms().size(), testRooms.size());
	}

	@Test
	void updateRoomTest() {
		roomMemory.addRoom(new Room("Green", true));
		System.out.println(roomMemory.getRooms());
		Room modifiedRoom = roomMemory.getRoom(10);
		modifiedRoom.setName("TEST");
		roomMemory.updateRoom(10, modifiedRoom);
		assertEquals(roomMemory.getRoom(10).getName(), "TEST");
	}

	@Test
	void getAvailableRoomsTest() {
		assertNotNull(roomMemory.getAvailableRooms());
	}

	@Test
	void getRoomsWithRatOwnersTest() {
		assertNotNull(roomMemory.getRoomsWithRatOwners());
	}


}
