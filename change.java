import java.util.Scanner;

public class change {
    public static void main(String[] args){
        // Defines the amount for each form of currency
        double quarter =  .25;
        double dime = .10;
        double nickel = .05;
        double penny = .01;

        //Asks for the user to give an input ie: amount of change they have
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much change do you have");
        String change = scanner.nextLine();
        double change_number = Double.parseDouble(change);
        System.out.printf("%.2f\n", change_number);

        // Does the logic required to see how many coins and carries over remainder
        double quarters = change_number / quarter;
        double dimes = (change_number - (quarters * .25)) / dime;
        double nickels = (change_number -((quarters * .25)+(dimes * .10))) / nickel;
        double pennies = (change_number -((quarters * .25)+(dimes * .10)+(nickels * .05))) / penny;

        // Prints out formatted
        // Reformat - only quarters are being represented.
        System.out.println("Number of each coin");
        System.out.printf("Quarters: %.2f\n", quarters);
        System.out.printf("Dimes: %.2f\n", dimes);
        System.out.printf("Nickels: %.2f\n", nickels);
        System.out.printf("Pennies: %.2f\n", pennies);
    }
}