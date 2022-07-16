package com.codecool.hogwartshouses.controller;


import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping(value = "/rooms")
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getRooms());
        return "rooms";
    }

    @PostMapping(value = "/rooms")
    public String addRoom(Model model){
        model.addAttribute("rooms", roomService.addRoom());
        return "redirect:";
    }

    @GetMapping(value = "/rooms/{roomID}")
    public String getRoom(Model model, @PathVariable int roomID){
        model.addAttribute("rooms", roomService.getRoom(roomID));
        return "rooms";
    }

}
