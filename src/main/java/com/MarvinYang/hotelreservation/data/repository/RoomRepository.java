package com.MarvinYang.hotelreservation.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MarvinYang.hotelreservation.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	
}