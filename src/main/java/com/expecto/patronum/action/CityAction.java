package com.expecto.patronum.action;

import java.util.List;

import com.expecto.patronum.manager.CityManager;
import com.expecto.patronum.model.City;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class CityAction extends ActionSupport{

	private static final long serialVersionUID = 7938625940602805437L;
	
	private CityManager cityManager;
	private String output;

	public String fetchAllCity() {
		try {
			List<City> listCity = cityManager.fetchAllCity();
			Gson gson = new Gson();
			output = gson.toJson(listCity);
			System.out.println(output);
		}catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	public CityManager getCityManager() {
		return cityManager;
	}

	public void setCityManager(CityManager cityManager) {
		this.cityManager = cityManager;
	}


	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	
	
}
