package com.myrooomz.booking.controller;

import com.myrooomz.booking.exception.RoomNotFoundException;
import com.myrooomz.booking.dto.Room;
import com.myrooomz.booking.service.IRoomService;
import com.myrooomz.booking.service.RoomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    @Autowired
    public IRoomService roomService;
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
        return roomService.findRoom(id);
    }

    @Operation(summary = "Get all Rooms")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Room Found !",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Room.class)) }),
            @ApiResponse(responseCode = "400", description = "No Rooms Available",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Rooms not found",
                    content = @Content) })
    @GetMapping("")
    public List<Room> GetAllRooms() {
        return roomService.getAllRooms();
    }
}
