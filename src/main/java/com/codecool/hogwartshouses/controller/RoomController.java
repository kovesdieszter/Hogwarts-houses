package com.codecool.hogwartshouses.controller;


import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping(value = "rooms")
    public String getRooms(Model model){
        Set<Room> rooms = roomService.getRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

}
