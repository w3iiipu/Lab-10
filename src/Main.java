import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Car(1, "Ford", "Explorer", 2016, 27999.99));
        carList.add(new Car(2, "Jeep", "Cherokee", 2017, 42998.99));
        carList.add(new Car(3, "Chevrolet", "Suburban", 2016, 56998.99));

        carList.add(new UsedCar(4, "Mazda", "CX-5", 2012, 16599.99, 38123, "Good"));
        carList.add(new UsedCar(5, "Honda", "Civic", 2010, 9500.00, 72553, "Fair"));
        carList.add(new UsedCar(6, "Audi", "A5", 2015, 30999.99, 6199, "Excellent"));

        System.out.println("Welcome to the Grand Circus Motors admin console!\n");                                      //welcome message


        String userBuyAgain = "yes";
        do {

            carInventory(carList);                  //prints inventory

            int userInput = Validator.getInt(scan1, "\nWhich car would you like to preview?\n");                 //user input for which car to view

            System.out.println("Here is details of car number " + (userInput) + " : \n");                                //prints details of car user selected
            System.out.println(carList.get(userInput - 1).printInventory());


            String userBuy = Validator.getString(scan1, " \nWould you like to purchase this car? ");             //confirms if user wants to buy the car

            if (userBuy.equalsIgnoreCase("y") || userBuy.equalsIgnoreCase("yes")) {
                carList.remove(userInput - 1);                                                                     //removes the item from inventory if user wants to buy the car
                System.out.println("Congratulation on your purchase! Please proceed to our Financing Department! \n");


                String userpreview = Validator.getString(scan1, "Would you like to view the updated inventory?"); //promp user to view updated inventory
                if (userpreview.equalsIgnoreCase("n") || userpreview.equalsIgnoreCase("no")){
                    System.out.println("Thank you for visiting!");                                                       //exits
                    break;
                }
            } else {
                System.out.println("Thank you for visiting!");
                break;                                                                                                    //exits
            }
        }

        //  continues if user wants to buy another car
        while (userBuyAgain.equalsIgnoreCase("y") || userBuyAgain.equalsIgnoreCase("yes"));     //continues the loop as long as user enter y or yes

    }



/*
    This method prints the array list of car inventory
 */

    public static void carInventory(ArrayList<Car> carList) {
        System.out.println("Current Inventory : ");                     //prints the array list
        for (int i = 0; i < carList.size(); ++i) {
            if (carList.get(i) instanceof UsedCar) {                    //prints USED if it is instance of UsedCar

                System.out.print((i + 1) + ". ");
                System.out.print("USED ");
                System.out.println(carList.get(i).printInventory());
            } else {

                System.out.print((i + 1) + ". ");
                System.out.print("NEW  ");
                System.out.println(carList.get(i).printInventory());
            }
        }

    }
}