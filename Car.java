
public class Car {
	private int yearModel;
	private String make;
	     private int speed;
	     
	    // The constructor accept the car's year model and make as argument
	    // The constuctor should assign 0 to the speed field
	     
	    public Car (int yrModel, String carMake)
	    {
	        yearModel = yrModel;
	        make = carMake;
	        speed = 0;
	    }
	    public void setyearModel(int yrModel)
	    {
	    yearModel = yrModel;
	}
	public void setMake (String carMake)
	{
	    make = carMake;
	}
	    public void setSpeed(int carSpeed)
	    {
	    speed = carSpeed;
	} 
	public int getYearModel()
	{
	    return yearModel;
	}
	public String getMake ()
	{
	    return make;
	}
}



