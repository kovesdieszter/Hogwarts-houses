package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.model.types.PetType;
import com.codecool.hogwartshouses.service.DAO.RoomMemory;
import com.codecool.hogwartshouses.service.DAO.StudentMemory;
import org.springframework.stereotype.Component;


@Component
public class RoomCreator {

    private final RoomMemory roomMemory;
    private final StudentMemory studentMemory;

    public RoomCreator(RoomMemory roomMemory, StudentMemory studentMemory) {
        this.roomMemory = roomMemory;
        this.studentMemory = studentMemory;
        initialize();
    }

    public void initialize() {
        Student studentHermione = new Student("Hermione Granger", PetType.CAT);
        Student studentDraco = new Student("Draco Malfoy", PetType.OWL);
        Student studentRon = new Student("Ron Weasley", PetType.RAT);
        Student studentSteven = new Student("Steven Rat", PetType.RAT);
        studentMemory.addStudent(studentHermione);
        studentMemory.addStudent(studentDraco);
        studentMemory.addStudent(studentRon);
        studentMemory.addStudent(studentSteven);

        roomMemory.addRoom(new Room("Green", studentHermione));
        roomMemory.addRoom(new Room("Red", studentDraco));
        roomMemory.addRoom(new Room("Black", studentRon));
        roomMemory.addRoom(new Room("Grey", studentSteven));
        roomMemory.addRoom(new Room("White", true));
        roomMemory.addRoom(new Room("Purple", true));
    }
}
