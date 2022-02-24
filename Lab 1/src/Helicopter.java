import java.text.DecimalFormat;
import java.util.ArrayList;

public class Helicopter {
    private double FuelCapacity;
    private double CurrentFuel;
    private int MPG;
    private Location current;
    DecimalFormat df= new DecimalFormat("0.00");

    public Helicopter(double FuelCapacity, int MPG, Location current)
    {
    this.current=current;
    this.FuelCapacity=FuelCapacity;
    CurrentFuel= FuelCapacity;
    this.MPG= MPG;
    }

    public void Refuel()
    {
        if (current.isGas()==true)
     {
         this.CurrentFuel = this.FuelCapacity;
         System.out.println("You've topped up your tank and have "+df.format(this.CurrentFuel)+" gallons of fuel.");
     }

        else
        {
        System.out.println("No gas station here.");
        }
    }

     public String Travel(Location destination)
    {   double a=Math.pow((this.current.getCoordinateX() - destination.getCoordinateX()),2);
        double b=Math.pow((this.current.getCoordinateY() - destination.getCoordinateY()),2);
        double c=Math.sqrt((a+b));
        if (c<=this.CurrentFuel*this.MPG)
        {
            this.current=destination;
            this.CurrentFuel= this.CurrentFuel-(c/this.MPG);
            System.out.println("You successfully traveled to "+destination.getPlace()+ ".");
        }
        else {
         System.out.println("Uh oh, you don't have enough fuel to fly there. Try another location!");
        }
           return this.toString();

    }

    public boolean AmIStuck(ArrayList<Location> check)
    {
        boolean x =true;
        for (int i=0;i<check.size(); i++)
        {
            double a=Math.pow((this.current.getCoordinateX() - check.get(i).getCoordinateX()),2);
            double b=Math.pow((this.current.getCoordinateY() - check.get(i).getCoordinateY()),2);
            double c=Math.sqrt((a+b));
            if(c<=this.CurrentFuel*this.MPG && this.current.getPlace().compareTo(check.get(i).getPlace())!=0)
            {
                x= false;
            }
        }

        return x;
    }

    public double getFuelCapacity() {
        return FuelCapacity;
    }

    public double getCurrentFuel() {
        return CurrentFuel;
    }

    public int getMPG() {
        return MPG;
    }

    public Location getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        return "Your helicopter is in " + this.current.getPlace() +" and has " + df.format(this.CurrentFuel) + " gallons of fuel left.";
    }
}