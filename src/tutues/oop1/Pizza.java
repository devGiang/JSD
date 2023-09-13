package tutues.oop1;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calsCost(){
        double baseCost;

        if (size.equalsIgnoreCase("small")) {
            baseCost = 10.0;
        } else if (size.equalsIgnoreCase("medium")) {
            baseCost = 12.0;
        } else if (size.equalsIgnoreCase("large")) {
            baseCost = 14.0;
        } else {
            throw new IllegalArgumentException("Invalid pizza size");
        }

        double toppingsCost = (cheeseToppings + pepperoniToppings + hamToppings) * 2.0;
        return baseCost + toppingsCost;
    }

    public String getDescription() {
        double totalCost = calsCost();
        return String.format("Size: %s, Cheese Toppings: %d, Pepperoni Toppings: %d, Ham Toppings: %d, Cost: $%.2f",
                size, cheeseToppings, pepperoniToppings, hamToppings, totalCost);
    }
}
