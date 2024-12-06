//Denesse Sosa
public class Car extends Vehicle {
	
	//instance variables
	private double mileage;
	private int passengers;
	
	//default constructor 
	public Car()
	{
		super();
		mileage = 0;
		passengers = 0;
	}
	
	public Car(String xManuName, int xCylinders, String xOwnersName, double xMileage, int xPassengers)
	{
		super(xManuName,xCylinders, xOwnersName);
		
		this.setMileage(xMileage);
		this.setPassengers(xPassengers);
	}

	//Accessors
	public double getMileage()
	{
		return this.mileage;
	}
	
	public double getPassengers()
	{
		return this.passengers;
	}
	
	//Mutators
	public void setMileage(double xMileage)
	{
		if(xMileage > 0)
		{
			this.mileage = xMileage;
		}
	}
	
	public void setPassengers(int xPassengers) {
		if(xPassengers > 0 )
		{
			this.passengers = xPassengers;
		}
	}
	
	/*
	 *  compares this car with another car object. Returns true only if all instance variables from this class and super class are true
	 */
	public boolean equals(Car car)
	{
		boolean status;
		
		super.equals(car);
		
		if(mileage == car.mileage && passengers ==car.passengers)
		{
			status = true;
		}
		
		else
		{
			status = false;
		}
		
		return status;
	}
	
	//overrides vehicle to string method, and also returns the car's gas mileage and passengers
	public String toString()
	{
		return super.toString() + 
				"\nGas Mileage: " + this.mileage + " gallons" + 
				"\nNumber of Passengers: " + this.passengers;
	}
}
