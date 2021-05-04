public class Car extends Vehicle {
	private int numberOfDoors;
	private int numberOfPassengers;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers){
		super(aMake, aModel, aPlate);
		this.numberOfDoors = doors;
		this.numberOfPassengers = passengers;
	}
	
		
	public int getDoors(){
		return this.numberOfDoors;
	}
	
	public int getPassengers(){
		return this.numberOfPassengers;
	}

	public String toString(){
		
		//[#]-door [make] [model] with license [plate].
		String result = String.format("%d-door %s %s with license %s", this.numberOfDoors, this.getMake(),this.getModel(), this.getPlate());
		return result;
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.numberOfDoors == otherCar.getDoors()) {
			if(this.numberOfPassengers == otherCar.getPassengers()) {
					return super.equals(other);
				}
			}
		return false;
	}
	
	public Car copy(){
	//	public Car(String aMake, String aModel, String aPlate, int doors, int passengers){
	//	super(aMake, aModel, aPlate);
	//	this.numberOfDoors = doors;
	//	this.numberOfPassengers = passengers;
	//}
		String aMake = this.getMake();
		String aModel = this.getModel();
		String aPlate = this.getPlate();
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		
		Car aCar = new Car(aMake, aModel, aPlate, doors, passengers);
		return aCar;
	}
}