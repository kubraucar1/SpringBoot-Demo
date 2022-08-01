package com.javaudemy.springBootDemo.Hibernate.Dal;

import java.util.List;

import com.javaudemy.springBootDemo.apiDemo.City;

public interface ICityDal {
	
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
	
	
	
	
	

}
