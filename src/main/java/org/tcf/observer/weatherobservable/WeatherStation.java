/*
 * Adapted from Head First Design Patterns
 * Eric & Elisabeth Freeman (with Kathy Sierra and Bert Bates)
 * ISBN 0-596-00712-4
 * 2004
 */

package observer.weatherobservable;

public class WeatherStation
	{
	public static void main(String[] args)
		{
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80,65,30.4f);
		weatherData.setMeasurements(82,70,29.2f);
		weatherData.setMeasurements(78,90,29.2f);
		}
	}
