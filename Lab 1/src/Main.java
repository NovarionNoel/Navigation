import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;
public class Main {

    public static void main (String[] args){

            Scanner input = new Scanner(System.in);
            ArrayList<Location> loc = new ArrayList<Location>();
            loc.add(new Location("Cleveland", 0, 0, true));
            loc.add(new Location("North Pole", 500, -100,true));
            loc.add(new Location("Campbell Hill",-50,-50,false));
            loc.add(new Location("Tokyo",-100,1000,true));
            loc.add(new Location("Chicago",-200,75,true));
            loc.add(new Location("Erie PA", 150,0,true));
            loc.add(new Location("Allegheny National Forest",300,-75,false));


            System.out.println("Hello! Let's fly a private helicopter. We'll start in Cleveland. Tell me about your helicopter!");

            System.out.print("How many gallons of fuel can it hold? ");
            double fuel=input.nextDouble();
            input.nextLine();

            System.out.print("How many miles per gallon does it get?");
            int mpg =input.nextInt();
            input.nextLine();

            Helicopter heli =new Helicopter(fuel,mpg,loc.get(0));
            while (heli.AmIStuck(loc) == false)
            {
            System.out.println("Where would you like to go? Please enter the number associated with the destination.");
            System.out.println("You can fly to Cleveland (0), the North Pole (1), Campbell Hill (2), Tokyo(3), Chicago (4), Erie PA (5), or Allegheny National Forest (6).");
            int a = input.nextInt();
             input.nextLine();
            System.out.println(heli.Travel(loc.get(a)));
            heli.Refuel();
            }
            System.out.println("Uh oh, you don't have enough fuel to get anywhere! See you next time.");





}
}