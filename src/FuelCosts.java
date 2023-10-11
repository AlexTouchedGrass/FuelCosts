import java.util.Scanner;
import java.lang.Math;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double costPer100 = 0;
        double totalDistance = 0;
        double numGallon = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        boolean valid = true;
        boolean trueOne = true;
        boolean trueTwo = true;
        boolean trueThree = true;

        //FIRST DO WHILE

        do {
            System.out.println("Please enter a value for Number of Gallons.");


            if (scan.hasNextDouble()) {
                numGallon = scan.nextDouble();
                scan.nextLine();
                System.out.println("Your value for Number of Gallons is : " + numGallon);

                if (numGallon >= 0) {
                    if (numGallon >= 200) {
                        System.out.println("You've got yourself an unusually large vehicle there. Try again.");

                    } else {
                        System.out.println("Valid input.");
                        trueOne = false;
                    }
                } else {
                    System.out.println("Invalid input : Less than zero. Try again.");
                }
            } else {
                scan.nextLine();
                System.out.println("Your value for Number of Gallons is : ERROR " );
                System.out.println("Invalid input. Try again.");

                }

        } while (trueOne);

        //SECOND DO WHILE

        do {
            System.out.println("Please enter a value for Fuel Efficiency.");


            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                scan.nextLine();
                System.out.println("Your value for Fuel Efficiency is : " + fuelEfficiency);

                if (fuelEfficiency >= 0) {
                    if (fuelEfficiency >= 80) {
                        System.out.println("You've got yourself an unusually efficient vehicle there. Try again.");

                    } else {
                        System.out.println("Valid input.");
                        trueTwo = false;
                    }
                } else {
                    System.out.println("Invalid input : Less than zero. Try again.");
                }
            } else {
                scan.nextLine();
                System.out.println("Your value for Fuel Efficiency is : ERROR " );
                System.out.println("Invalid input. Try again.");

            }

        } while (trueTwo);

        //THIRD DO WHILE

        do {
            System.out.println("Please enter a value for Gas Price.");


            if (scan.hasNextDouble()) {
                gasPrice = scan.nextDouble();
                scan.nextLine();
                System.out.println("Your value for Gas Price is : " + gasPrice);

                if (gasPrice >= 0) {
                    if (gasPrice >= 200) {
                        System.out.println("You've got yourself an unusually large vehicle there. Try again.");

                    } else {
                        System.out.println("Valid input.");
                        trueThree = false;
                    }
                } else {
                    System.out.println("Invalid input : Less than zero. Try again.");
                }
            } else {
                scan.nextLine();
                System.out.println("Your value for Gas Price is : ERROR " );
                System.out.println("Invalid input. Try again.");

            }

        } while (trueThree);

        costPer100 = gasPrice * 100;
        totalDistance = numGallon * fuelEfficiency;

            System.out.printf("Number Of Gallons : %6.2f", numGallon);
            System.out.printf("\nFuel Efficiency : %8.2f",fuelEfficiency);
            System.out.printf("\nGas Price       : %8.2f", gasPrice);
            System.out.printf("\n Cost per 100 miles in $ :%5.2f", costPer100);
            System.out.printf("\n Cost per 100 miles in $ :%5.2f", totalDistance);




    }
}
