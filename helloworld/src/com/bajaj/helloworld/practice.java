package com.bajaj.helloworld;
//abstract classes
interface vehicle{
	void tyres();
}
abstract class autovehicle{
	abstract void autopilot();
}
class car extends autovehicle implements vehicle{
	public void autopilot() {
		System.out.println("auto-driving");
	}
	@Override
	public void tyres() {
		System.out.println("there are 4");
	}
	public void name() {
		System.out.println("hey car");
	}
}
public class practice{
	public static void main(String args[]) {
		vehicle v=new vehicle() {
			@Override
			public void tyres() {
				System.out.println("there are");
			}
};
		autovehicle a=new autovehicle() {
			public void autopilot() {
				System.out.println("auto.driving");
			}
		};
		car c=new car();
		vehicle av=new car();
		
		av.tyres();
		v.tyres();
		a.autopilot();
		c.tyres();
		c.autopilot();
		c.name();
	}
}