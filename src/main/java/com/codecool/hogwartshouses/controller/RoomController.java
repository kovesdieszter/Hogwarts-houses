package com.codecool.hogwartshouses.controller;


import com.codecool.hogwartshouses.model.Room;
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

    @DeleteMapping(value = "/rooms/{roomID}")
    public String deleteRoom(Model model, @PathVariable int roomID){
        model.addAttribute("rooms", roomService.deleteRoom(roomID));
        return "rooms";
    }

    @PutMapping(value = "/rooms/{roomID}")
    public String updateRoom(Model model, @PathVariable int roomID, @RequestBody Room room){
        model.addAttribute("rooms", roomService.updateRoom(roomID, room));
        return "rooms";
    }

    @GetMapping(value = "/rooms/available")
    public String getAvailableRooms(Model model){
        model.addAttribute("rooms", roomService.getAvailableRooms());
        return "rooms";
    }

    @GetMapping(value = "/rooms/rat-owners")
    public String getRoomsWithRatOwners(Model model){
        model.addAttribute("rooms", roomService.getRoomsWithRatOwners());
        return "rooms";
    }

}
