package lab10;

/**
 * Car.java
 * 
 * @author Suleman Lakhani
 * This class...extends Vehicle class and contains methods for getter,
 * toString, equals and copy method
 *
 */
public class Car extends Vehicle {
	
	//initialized variables
	private int numberOfDoors;
	private int numberOfPassengers;
	
	//main method
	public static void main(String[] args) {
		Car aCar = new Car("Toyota", "Corolla LE", "VA1234", 4, 4);
		aCar.copy();
		aCar.toString();
		System.out.println("Hello");
	}
	
	//parameterized constructor
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers){
		super(aMake, aModel, aPlate);
		this.numberOfDoors = doors;
		this.numberOfPassengers = passengers;
	}
	
	//getter for doors
	public int getDoors(){
		return this.numberOfDoors;
	}
	
	//getter for passengers
	public int getPassengers(){
		return this.numberOfPassengers;
	}

	//to String method
	@Override
	public String toString(){
		
		//[#]-door [make] [model] with license [plate].
		String result = String.format("%d-door ", this.numberOfDoors);
		return result;
	}
	
	//equals method
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.numberOfDoors==otherCar.getDoors()) {
			if(this.numberOfPassengers==otherCar.getPassengers()) {
					return super.equals(other);
				}
			}
		return false;
	}
	
	//copy method to return a new Car
	public Car copy(){
	
		String aMake = this.getMake();
		String aModel = this.getModel();
		String aPlate = this.getPlate();
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		
		Car aCar = new Car(aMake, aModel, aPlate, doors, passengers);
		return aCar;
	}
}