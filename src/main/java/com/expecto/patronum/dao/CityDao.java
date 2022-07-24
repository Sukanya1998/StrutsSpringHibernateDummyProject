package com.expecto.patronum.dao;

import java.util.List;

import com.expecto.patronum.model.City;

public interface CityDao {

	List<City> fetchAllCity();
}
