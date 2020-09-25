package com.jj.microservices.limitsservice.bean;

public class LimitsConfiguration {

	private int max,min;

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public LimitsConfiguration(int min, int max) {
		super();
		this.max = max;
		this.min = min;
	}
	
	protected LimitsConfiguration() {
		
	}
}
