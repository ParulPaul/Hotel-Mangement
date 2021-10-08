package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IHotelDao;

import com.techment.dto.HotelDto;

import com.techment.entity.Hotel;


@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	IHotelDao hotelDao;

	@Override
	public String addHotel(HotelDto hoteldto) {
		Hotel hotel = new Hotel();
		hotel.setAvg_rate_per_day(hoteldto.getAvg_rate_per_day());
		hotel.setHotel_address(hoteldto.getHotel_address());
		hotel.setHotel_city(hoteldto.getHotel_city());
		hotel.setHotel_description(hoteldto.getHotel_description());
		hotel.setHotel_email(hoteldto.getHotel_email());
		hotel.setHotel_id(hoteldto.getHotel_id());
		hotel.setHotel_name(hoteldto.getHotel_name());
		hotel.setHotel_phone1(hoteldto.getHotel_phone1());
		hotel.setHotel_phone2(hoteldto.getHotel_phone2());
		hotel.setHotel_website(hoteldto.getHotel_website());
		hotelDao.save(hotel);
		return "Hotel Details are added..";
	}

	@Override
	public String updateHotel(HotelDto hoteldto, int id) {
		Hotel newHotel = hotelDao.findById(id).get();
		newHotel.setAvg_rate_per_day(hoteldto.getAvg_rate_per_day());
		newHotel.setHotel_address(hoteldto.getHotel_address());
		newHotel.setHotel_city(hoteldto.getHotel_city());
		newHotel.setHotel_description(hoteldto.getHotel_description());
		newHotel.setHotel_email(hoteldto.getHotel_email());
		newHotel.setHotel_id(hoteldto.getHotel_id());
		newHotel.setHotel_name(hoteldto.getHotel_name());
		newHotel.setHotel_phone1(hoteldto.getHotel_phone1());
		newHotel.setHotel_phone2(hoteldto.getHotel_phone2());
		newHotel.setHotel_website(hoteldto.getHotel_website());
		hotelDao.save(newHotel);
		return "Hotel details updated";
	}

	@Override
	public String removeHotel(HotelDto hoteldto, int id) {
		hotelDao.deleteById(id);
		return "Hotel removed";
	}

	@Override
	public List<HotelDto> showAllHotels() {

		List<Hotel> hotels = hotelDao.findAll();
		List <HotelDto>  detailDto = new ArrayList<HotelDto>();
		
		for (Hotel hotel : hotels) {
			
			detailDto.add(new HotelDto(hotel.getHotel_id(),hotel.getAvg_rate_per_day(),hotel.getHotel_address(),hotel.getHotel_city(),
					hotel.getHotel_description(),hotel.getHotel_email(),hotel.getHotel_name(),hotel.getHotel_phone1(),
					hotel.getHotel_phone2(),hotel.getHotel_website()));
			
		}
		return detailDto;
	}

	@Override
	public HotelDto showHotelById(int id) {
		
		Hotel hotel = hotelDao.findById(id).get();
		HotelDto hotelDto =new HotelDto(hotel.getHotel_id(),hotel.getAvg_rate_per_day(),hotel.getHotel_address(),hotel.getHotel_city(),
				hotel.getHotel_description(),hotel.getHotel_email(),hotel.getHotel_name(),hotel.getHotel_phone1(),
				hotel.getHotel_phone2(),hotel.getHotel_website());
		
		
		
	    return hotelDto;
	}

	

	


}
