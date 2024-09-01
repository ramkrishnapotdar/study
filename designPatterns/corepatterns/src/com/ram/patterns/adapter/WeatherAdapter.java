package com.ram.patterns.adapter;

public class WeatherAdapter {
	public int findWeather(int zipcode)
	{
		String city = null;
		if ( zipcode == 1)
			city = "city1";
		if ( zipcode == 2)
			city = "city2";
		WeatherFinder finder = new WeatherFinderImpl();
		return finder.find(city);
		
	}
}
