package com.myrooomz.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {
    @GetMapping("/{id}")
    public void FindRoom(int id) {
        System.out.println("Searching for roomid " + id);
    }
}
