package org.launchcode;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // method for adding new item
        Scanner input = new Scanner(System.in);
        String newItem;
        String enterName;
        int enterPrice;
        String enterDescription;
        String enterCategory;
        public void newMenuItem() {
            System.out.println("Set the MenuItem class:");
            do {
                newItem = input.nextLine();
            } while(!newItem.isEmpty());
            System.out.println("Enter the new menu item's name:");
            do {
                enterName = input.nextLine();
            } while(!enterName.isEmpty());
            System.out.println("Enter the item's price:");
            do {
                enterPrice = input.nextInt();
            } while(enterPrice == 0);
            System.out.println("Enter the item's description:");
            do {
                enterDescription = input.nextLine();
            } while(!enterDescription.isEmpty());
            System.out.println("What category (pizza, salad, sandwich) does the item belong to?");
            do {
                enterCategory = input.nextLine();
            } while(enterCategory != "pizza" || enterCategory != "salad" || enterCategory != "sandwich");

            // update the menu date
            MenuItem ____ = new MenuItem(enterName, enterPrice, enterDescription, enterCategory);
        }
        // method for removing item
    }
}
