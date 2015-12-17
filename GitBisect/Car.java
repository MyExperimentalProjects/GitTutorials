/**
   A simulated car that consumes gas as it drives.
*/
public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;
    private String model;
   

    /**
       Constructs a car with a given fuel efficiency.
    */
    public Car(double mpg, String mdl)
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg;
        model = mdl;
    }

  
    /**
      Adds the given amount of gas in the tank of this car.
      @param amount the amount of gas to add
    */
   
    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    /**
      Gets the current amount of gas in the tank of this car.
      @return the current gas level
    */
    public double getGasInTank()
    {
        return gasInTank;
    }

    /**
      Gets the model of this car.
      @return the model
    */
    public String getModel()
    {
        return model;
    }

    /**
      Drives this car by a given distance.
      @param distance the distance to drive
    */
    public void drive(double distance)
    {
        this.milesDriven = this.milesDriven + distance;
        double gasConsumed = distance / this.milesPerGallon;
        this.gasInTank = this.gasInTank - gasConsumed;
    }  

    /**
      Gets the current mileage of this car.
      @return the total number of miles driven
    */
    public double getMilesDriven()
    {
        return milesDriven;
    }
}
