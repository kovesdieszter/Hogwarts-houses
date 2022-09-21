package com.codecool.hogwartshouses;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.model.types.PetType;
import com.codecool.hogwartshouses.service.DAO.RoomMemory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HogwartsHousesApplicationTests {

	private Set<Room> testRooms = new HashSet<>();
	private RoomMemory roomMemory = new RoomMemory(testRooms);


	@Test
	void getRoomsWithEmptyRoomsTest(){
		assertEquals(0, roomMemory.getRooms().size());
	}

	@Test
	void getRoomsWithRoomsTest(){
		testRooms.addAll(Set.of(new Room(), new Room("Room1", false), new Room("Room2", true)));
		assertEquals(3, roomMemory.getRooms().size());
	}

	@Test
	void getRoomByIdTest() {
		Room testRoom = new Room("Purple", true);
		roomMemory.addRoom(testRoom);
		assertEquals(roomMemory.getRoom(7), testRoom);
	}

	@Test
	void addRoomTest(){
		int sizeOfRooms = roomMemory.getRooms().size();
		roomMemory.addRoom();
		assertEquals(sizeOfRooms + 1, roomMemory.getRooms().size());
	}


	@Test
	void deleteRoomTest(){
		testRooms.addAll(Set.of(new Room(), new Room("Room1", false), new Room("Room2", true)));
		int sizeOfRooms = roomMemory.getRooms().size();
		roomMemory.deleteRoom(19);
		assertEquals(sizeOfRooms - 1, roomMemory.getRooms().size());
	}

	@Test
	void updateRoomTest() {
		roomMemory.addRoom(new Room("Green", true));
		Room modifiedRoom = roomMemory.getRoom(15);
		modifiedRoom.setName("TEST");
		roomMemory.updateRoom(10, modifiedRoom);
		assertEquals(roomMemory.getRoom(15).getName(), "TEST");
	}

	@Test
	void getAvailableRoomsWithEmptyRoomsTest() {
		assertEquals(0, roomMemory.getAvailableRooms().size());
	}
	@Test
	void getAvailableRoomsWithAvailableRoomsTest() {
		testRooms.addAll(Set.of(new Room(), new Room("Room1", false), new Room("Room2", true)));
		int sizeOfAvailableRooms = roomMemory.getAvailableRooms().size();
		assertEquals(2, sizeOfAvailableRooms);
	}

	@Test
	void getRoomsWithoutRatOwnersTest() {
		assertEquals(0, roomMemory.getRoomsWithRatOwners().size());
	}

	@Test
	void getRoomsWithRatOwnersTest() {
	testRooms.addAll(Set.of(
			new Room(),
			new Room("Room1", new Student("Ronny", PetType.RAT)),
			new Room("Room2", new Student("Ron", PetType.CAT))));
		assertEquals(1, roomMemory.getRoomsWithRatOwners().size());
	}


}
