package tutes.oop2;

abstract class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    private String name;

    public Pizza(String size, String name, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
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

    public String getName(){
       return this.getClass().getSimpleName();
    }
    static class Topping{
        String name;
        int quantity;
        int cost;

        public Topping(String name, int quantity, int cost) {
            this.name = name;
            this.quantity = quantity;
            this.cost = cost;
        }
    }



}


