/*
 * Adapted from Head First Design Patterns
 * Eric & Elisabeth Freeman (with Kathy Sierra and Bert Bates)
 * ISBN 0-596-00712-4
 * 2004
 */

package org.tcf.observer.weather;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		}

	public void update(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		}

	public void display() {
		System.out.println("Current conditions: " + temperature + " degrees Fahrenheit and " + humidity + "% humidity");
		}
	}
