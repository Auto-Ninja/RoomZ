package com.myrooomz.booking.service;

import com.myrooomz.booking.dto.Room;
import com.myrooomz.booking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoomService{
    @Autowired
    public RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.getAllRooms();
    }

    public Room findRoom(int roomId) {
        return roomRepository.findRoom(roomId);
    }

    public boolean deleteRoom(int roomId) {
        return false;
    }

    public Room saveRoom(Room room) {
        return null;
    }

    public Room updateRoom(int roomId, Room room) {
        return null;
    }
}
