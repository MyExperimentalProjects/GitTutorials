/**
   A simulated car that consumes gas as it drives.
*/
public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;
    private String brand;
    private String model;
    private boolean hasAC;
   

    /**
       Constructs a car with a given fuel efficiency.
    */
    public Car(double milesPerGallon, String brand, String model)
    {
        this.milesDriven = 0;
        this.gasInTank = 0;
        this.milesPerGallon = milesPerGallon;
        this.brand = brand;
        this.model = model;
        this.hasAC = false;
    }

  
    /**
      Adds the given amount of gas in the tank of this car.
      @param amount the amount of gas to add
    */
   
    public void addGas(double amount)
    {
        gasInTank = 0;
        gasInTank = gasInTank + amount;
    }

    /**
      Sets whether the car has an AC
      @param whether car has an AC
    */
   
    public boolean setHasAC(boolean hasAC)
    {
        this.hasAC = hasAC;
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
      Gets the brand of this car.
      @return the brand
    */
    public String getBrand()
    {
        return brand;
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
