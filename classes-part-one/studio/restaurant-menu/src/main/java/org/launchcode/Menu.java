package org.launchcode;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<String> pizzas;
    private ArrayList<String> salads;
    private ArrayList<String> sandwiches;

    public ArrayList<String> getPizzas() {
        return pizzas;
    }
    public void setPizzas(ArrayList<String> pizzas) {
        this.pizzas = pizzas;
    }
    public ArrayList<String> getSalads() {
        return salads;
    }
    public void setSalads(ArrayList<String> salads) {
        this.salads = salads;
    }
    public ArrayList<String> getSandwiches() {
        return sandwiches;
    }
    public void setSandwiches(ArrayList<String> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public Menu(ArrayList<String> pizzas, ArrayList<String> salads, ArrayList<String> sandwiches) {
        this.pizzas = pizzas;
        this.salads = salads;
        this.sandwiches = sandwiches;
    }

    // menu has three fields which are the categories: pizzas, salads, sandwiches
        // each category is an ArrayList with each MenuItem.name as an entry

    // method to tell when menu was last updated
        // field of menu that keeps the date it was updated
        // when an item was added or removed it will set the new date updated

    // method for printing entire menu
}
