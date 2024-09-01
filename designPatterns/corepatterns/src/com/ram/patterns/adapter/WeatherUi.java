package com.ram.patterns.adapter;

public class WeatherUi {
	public void showTemp(int Zipcode)
	{
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findWeather(Zipcode));
		
	}
	
	public static void main(String args[])
	{
		WeatherUi ui = new WeatherUi();
		ui.showTemp(1);
		ui.showTemp(2);
	}
	
}
