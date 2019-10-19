/*
 * Adapted from Head First Design Patterns
 * Eric & Elisabeth Freeman (with Kathy Sierra and Bert Bates)
 * ISBN 0-596-00712-4
 * 2004
 */

package observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement
	{
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;

	public StatisticsDisplay(Observable observable)
		{
		observable.addObserver(this);
		}

	public void update(Observable observable,Object arg)
		{
		if(observable instanceof WeatherData)
			{
			WeatherData weatherData = (WeatherData)observable;
			float temp = weatherData.getTemperature();
			tempSum += temp;
			numReadings++;

			if(temp > maxTemp)
				maxTemp = temp;
			if(temp < minTemp)
				minTemp = temp;

			display();
			}
		}

	public void display()
		{
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
		}
	}
