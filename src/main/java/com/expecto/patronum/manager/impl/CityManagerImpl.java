package com.expecto.patronum.manager.impl;

import java.util.List;

import com.expecto.patronum.dao.CityDao;
import com.expecto.patronum.manager.CityManager;
import com.expecto.patronum.model.City;

public class CityManagerImpl implements CityManager{

	CityDao cityDao;

	public List<City> fetchAllCity() {
		return cityDao.fetchAllCity();
	}
	
	
	public CityDao getCityDao() {
		return cityDao;
	}


	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}

}
