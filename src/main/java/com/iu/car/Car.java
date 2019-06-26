package com.iu.car;

public class Car {

	private Wheel wheel;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	

	//생성자를 이용한 DI
	public Car(Wheel wheel) {
		this.wheel=wheel;
	}
	
	//메서드를 이용한 DI
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public Wheel getWheel() {
		return wheel;
	}
}
