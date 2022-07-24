package com.expecto.patronum.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.expecto.patronum.dao.CityDao;
import com.expecto.patronum.model.City;

public class CityDaoImpl extends HibernateDaoSupport implements CityDao{

	public List<City> fetchAllCity() {
		
		return (List<City>) getHibernateTemplate().find("From City");
	}

}
