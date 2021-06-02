package com.MarvinYang.hotelreservation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MarvinYang.hotelreservation.business.service.ReservationService;
import com.MarvinYang.hotelreservation.data.entity.Guest;

@Controller
@RequestMapping("/guests")
public class GuestsWebController {
	private final ReservationService reservationService;

	@Autowired
	public GuestsWebController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public String getGuests(Model model) {
		List<Guest> guests = this.reservationService.getHotelGuests();
		model.addAttribute("guests", guests);
		return "guests";
	}
}