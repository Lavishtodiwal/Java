class Vehicle{
	void start(){
		System.out.println("Vehicle Started successfully");
	}
}

class Car extends Vehicle{
	void drive(){
		System.out.println("Drive the car carefully:)");
	}
}
class SportCar extends Car{
	void speed(){
		start();
		drive();
		System.out.println("Car is ready for speed up :)");
	}
	public static void main(String... s){
		SportCar s1 = new SportCar();
		s1.speed();
	}
}