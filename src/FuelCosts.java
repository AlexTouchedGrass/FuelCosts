import java.util.Scanner;
import java.lang.Math;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numGallon = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        boolean valid = false;
        boolean trueOne = false;
        boolean trueTwo = false;
        boolean trueThree = false;

        do {
            System.out.println("Please enter a value for Number of Gallons.");


            if (scan.hasNextDouble()) {
                numGallon = scan.nextDouble();
                scan.nextLine();
                System.out.println("Your value for Number of Gallons is : " + numGallon);

                if (numGallon >= 0);

                }







        } while (!valid);




    }
}