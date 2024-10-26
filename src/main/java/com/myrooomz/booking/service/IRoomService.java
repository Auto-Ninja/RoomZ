package com.myrooomz.booking.service;

import com.myrooomz.booking.dto.Room;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IRoomService {

    public List<Room> getAllRooms();
    public Room findRoom(int roomId);

    public boolean deleteRoom(int roomId);

    public Room saveRoom(Room room);

    public Room updateRoom(int roomId,Room room);

}
