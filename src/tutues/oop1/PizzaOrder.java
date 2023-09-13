package tutues.oop1;

public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private int numPizzas;

    public PizzaOrder() {
        numPizzas = 0;
    }

    public void setNumPizzas(int num) {
        if (num >= 0 && num <= 3) {
            numPizzas = num;
        } else {
            System.out.println("Invalid number of pizzas.");
        }
    }

    public void setPizza1(Pizza pizza) {
        pizza1 = pizza;
    }

    public void setPizza2(Pizza pizza) {
        if (numPizzas >= 2) {
            pizza2 = pizza;
        } else {
            System.out.println("Not enough pizzas in the order.");
        }
    }

    public void setPizza3(Pizza pizza) {
        if (numPizzas >= 3) {
            pizza3 = pizza;
        } else {
            System.out.println("Not enough pizzas in the order.");
        }
    }

    public double calsTotal() {
        double totalCost = 0.0;
        if (pizza1 != null) {
            totalCost += pizza1.calsCost();
        }
        if (pizza2 != null) {
            totalCost += pizza2.calsCost();
        }
        if (pizza3 != null) {
            totalCost += pizza3.calsCost();
        }
        return totalCost;
    }
}
