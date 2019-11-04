package Interface2;

public class Car implements Vehicle,Alarm {
private final String brand;
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String getBrand() {
		return brand;
	}
	
	@Override
	public String speedUp() {
		return "The motorbike is speeding up.";
	}
	
	@Override
	public String slowDown() {
		return "The motorbike is slowing down.";
	}
	
	@Override
	public String turnAlarmOn() {
		return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
	}
	
	@Override
	public String turnAlarmOff() {
		return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
	}
}
