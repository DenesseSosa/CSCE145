//Denesse Sosa
public class Vehicle {
	
	//instance variables
	
	private String manuName;
	private int cylinders;
	private String ownersName;
	
	//Default constructor
	
	public Vehicle()
	{
		manuName = "";
		cylinders = 0;
		ownersName = "";
	}

	//parameterized constructor 
	public Vehicle(String xManuName, int xCylinders, String xOwnersName) 
	{
		if(xManuName != "")
		{
			this.setManuName(xManuName);
		}
		
		if(xCylinders >0)
		{
			this.setCylinders(xCylinders);
		}
		
		if(xOwnersName != "")
		{
			this.setOwnersName(xOwnersName);
		}
	}
		
	//Accessors for each variable
	public String getManuName()
	{
		return this.manuName;
	}
	
	public int getCylinders()
	{
		return this.cylinders;
	}
	
	public String getOwnersName()
	{
		return this.ownersName;
	}
		
	
	// Mutators
	// manuName and ownersName should not be blank 
	public void setManuName(String xManuName)
	{
		if(xManuName != "") 
		{
			this.manuName = xManuName;
		}
	}
	
	public void setCylinders(int xCylinders)
	{
		if(xCylinders > 0)
		{
			this.cylinders = xCylinders;
		}
	}
	
	public void setOwnersName(String xOwnersName)
	{
		if(xOwnersName != "")
		{
			this.ownersName = xOwnersName;
		}
	}
	
	
	/*
	 * equals method. Compares called vehicle and another vehicle. Returns true only if all 
	 * variables match
	 */
	public boolean equals(Vehicle vehicle)
	{
		boolean status;
		
		if(manuName.equals(vehicle.manuName) && cylinders == vehicle.cylinders && ownersName.equals(vehicle.ownersName))
		{ 
			status = true;
		}
		
		else
		{
			status = false;
		}
		
		return status;
	}
	
	public String toString()
	{
		return "Manufacturer's Name: " + this.manuName +
		"\nNumber of cylinders: " + this.cylinders +
		"\nOwner's Name: " + this.ownersName;
	}
	
	
	
}
