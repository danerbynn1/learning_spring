package com.erbynn.roomwebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.erbynn.roomwebapp.models.Room;
import com.erbynn.roomwebapp.service.RoomService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

   private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/")
    public String getAllRooms(@NotNull Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
