package com.expecto.patronum.model;

import java.util.Date;

public class City {
	private Integer cityId;
	private String city;
	private Country countryId;
	private Date lastUpdate;
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Country getCountryId() {
		return countryId;
	}
	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", city=" + city + ", countryId=" + countryId + ", lastUpdate=" + lastUpdate
				+ "]";
	}
}
