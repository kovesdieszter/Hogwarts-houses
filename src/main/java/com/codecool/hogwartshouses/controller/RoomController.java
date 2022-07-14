package com.codecool.hogwartshouses.controller;


import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Controller
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping(value = "/rooms")
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getRooms());
        return "rooms";
    }

}
