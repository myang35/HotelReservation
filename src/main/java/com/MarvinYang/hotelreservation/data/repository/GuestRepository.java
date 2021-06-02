package com.MarvinYang.hotelreservation.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MarvinYang.hotelreservation.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
	
}