package com.myrooomz.booking.repository;

import com.myrooomz.booking.dto.Room;
import com.myrooomz.booking.exception.RoomNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RoomRepository {
    public List<Room> getAllRooms() {
        List<Room> roomList = new ArrayList<Room>();
        for (int i = 0; i < 200; i++) {
            Room room=new Room();
            int id=i+1;
            room.setId(id);
            room.setName("Room No "+id);
            if(id>10)
                room.setFloor(id/10);
            else
                room.setFloor(1);
            roomList.add(room);
        }
        return roomList;
    }

    public Room findRoom(int roomId) {
        if(roomId>200)
            throw new RoomNotFoundException("Not Room Found");
        System.out.println("Searching for Room for Id  " + roomId);
        Room room=new Room();
        room.setId(roomId);
        room.setName("Room No "+roomId);
        if(roomId>10)
            room.setFloor(roomId/10);
        else
            room.setFloor(1);
        return room;
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
