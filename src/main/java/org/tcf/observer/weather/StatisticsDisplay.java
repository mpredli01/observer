/*
 * Adapted from Head First Design Patterns
 * Eric & Elisabeth Freeman (with Kathy Sierra and Bert Bates)
 * ISBN 0-596-00712-4
 * 2004
 */

package org.tcf.observer.weather;

import java.util.*;

public class StatisticsDisplay implements Observer,DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		}

	public void update(float temperature,float humidity,float pressure) {
		tempSum += temperature;
		numReadings++;

		if(temperature > maxTemp)
			maxTemp = temperature;
		if(temperature < minTemp)
			minTemp = temperature;

		display();
		}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
		}
	}
