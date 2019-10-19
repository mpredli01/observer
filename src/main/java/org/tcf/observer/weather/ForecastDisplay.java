/*
 * Adapted from Head First Design Patterns
 * Eric & Elisabeth Freeman (with Kathy Sierra and Bert Bates)
 * ISBN 0-596-00712-4
 * 2004
 */

package org.tcf.observer.weather;

import java.util.*;

public class ForecastDisplay implements Observer,DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private Subject weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		}

	public void update(float temperature,float humidity,float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
		}

	public void display() {
		System.out.print("Forecast: ");
		if(currentPressure > lastPressure)
			System.out.println("Improving weather on the way!");
		else if(currentPressure == lastPressure)
			System.out.println("More of the same");
		else if(currentPressure < lastPressure)
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
