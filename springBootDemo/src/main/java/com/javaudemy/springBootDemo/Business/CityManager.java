package com.javaudemy.springBootDemo.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javaudemy.springBootDemo.Hibernate.Dal.ICityDal;
import com.javaudemy.springBootDemo.apiDemo.City;

@Repository
public class CityManager implements ICityService {

	
	
	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		super();
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
	 return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

	@Override
	@Transactional
	public City getById(int id) {
		// TODO Auto-generated method stub
		return this.cityDal.getById(id);
	}

}
