package org.launchcode;
import java.util.HashMap;

public class MenuItem {
    private String name;
    private int price;
    private String description;
    private boolean updated;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUpdated() {
        return updated;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public MenuItem(String name, int price, String description, String category, boolean updated) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.updated = updated;
        this.category = category;
    }

    public MenuItem(String name, int price, String description, String category) {
        this(name, price, description, category, true);
    }

    @Override
    public String toString() {
        return name + ", " + description + ", $" + price;
    }

    // method to make each menu item into a hashmap to add to menu
//    public void hashItem() {
//        HashMap<String, String> item = new HashMap<>();
//        item.put("name", name);
//
//    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        MenuItem theItem = (MenuItem) toBeCompared;
        return theItem.getName() == getName() && theItem.getPrice() == getPrice();
    }

}

