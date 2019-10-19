/*
 * Adapted from Head First Design Patterns
 * Eric & Elisabeth Freeman (with Kathy Sierra and Bert Bates)
 * ISBN 0-596-00712-4
 * 2004
 */

package org.tcf.observer.weather;

public interface Observer {
	public void update(float temperature,float humidity,float pressure);
	}
