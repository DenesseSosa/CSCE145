//Denesse Sosa
public class Truck extends Vehicle{

	/*
	 * instance variables: loading capacity and towing capacity
	 */
	private double loadCap;
	private double towCap;
	
	//default constructor
	public Truck()
	{
		super(); 	//calls default constructor of vehicle
		loadCap =0;
		towCap = 0;
	}
	
	//parameterized constructor
	public Truck(String xManuName, int xCylinders, String xOwnersName, double xLoadCap, double xTowCap)
	{
		//calls for super's parameterized constructor
		super(xManuName, xCylinders, xOwnersName);
		this.setLoadCap(xLoadCap);
		this.setTowCap(xTowCap);
	}
	
	//Accessors
	public double getLoadCap()
	{
		return this.loadCap;
	}
	
	public double getTowCap()
	{
		return this.towCap;
	}
	
	//Mutators
	public void setLoadCap(double xLoadCap)
	{
		if(xLoadCap > 0)
		{
			this.loadCap = xLoadCap;
		}
	}
	
	public void setTowCap(double xTowCap)
	{
		if(xTowCap > 0)
		{
			this.towCap = xTowCap;
		}
	}
	
	//compares this truck object and another (all variables)
	public boolean equals(Truck truck)
	{
		
		boolean status;
		
		super.equals(truck);
		
		if(loadCap ==truck.loadCap && towCap == truck.towCap)
		{
			status = true;
		}
		
		else {
			status = false;
		}
		
		return status;
	}
	
	
	//overrides vehicles to string method
	public String toString()
	{
		return super.toString() +
				"\nLoad Capacity: " + this.loadCap +
		"\nTowing Capacity: " + this.towCap;
	}
	
}
