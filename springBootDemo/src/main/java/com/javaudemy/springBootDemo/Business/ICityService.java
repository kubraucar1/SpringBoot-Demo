package com.javaudemy.springBootDemo.Business;

import java.util.List;

import com.javaudemy.springBootDemo.apiDemo.City;

public interface ICityService {


	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
	
	
}
