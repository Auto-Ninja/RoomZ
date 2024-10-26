package com.myrooomz.booking.controller;

import com.myrooomz.booking.exception.RoomNotFoundException;
import com.myrooomz.booking.model.Room;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    @Operation(summary = "Get Room Details by Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Room Found !",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Room.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid Room Id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Room not found",
                    content = @Content) })
    @GetMapping("/{id}")
    public Room FindRoom(int id) {
        if(id>200)
            throw new RoomNotFoundException("Not Room Found");
        System.out.println("Searching for Room for Id  " + id);
        Room room=new Room();
        room.setId(id);
        room.setName("Room No "+id);
        if(id>10)
            room.setFloor(id/10);
        else
            room.setFloor(1);
        return room;
    }
}
