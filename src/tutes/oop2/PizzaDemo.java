package tutes.oop2;

public class PizzaDemo {
    public static void main(String[] args) {
        /*Pizza pizza = new Pizza("medium", 2, 1, 0);

        System.out.println("Pizza size: " + pizza.getSize());
        System.out.println("Cheese toppings: " + pizza.getCheeseToppings());
        System.out.println("Pepperoni toppings: " + pizza.getPepperoniToppings());
        System.out.println("Ham toppings: " + pizza.getHamToppings());

        pizza.setSize("large");
        pizza.setCheeseToppings(3);
        pizza.setPepperoniToppings(2);
        pizza.setHamToppings(1);

        System.out.println("Updated pizza size: " + pizza.getSize());
        System.out.println("Updated cheese toppings: " + pizza.getCheeseToppings());
        System.out.println("Updated pepperoni toppings: " + pizza.getPepperoniToppings());
        System.out.println("Updated ham toppings: " + pizza.getHamToppings());

        System.out.println("Pizza cost: $" + pizza.calsCost());

        pizza.setSize("large");
        pizza.setCheeseToppings(3);
        pizza.setPepperoniToppings(2);
        pizza.setHamToppings(1);

        System.out.println("Updated pizza cost: $" + pizza.calsCost());

        System.out.println(pizza.getDescription());
         */



        /*Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 0);
        PizzaOrder order = new PizzaOrder();

        order.setNumPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);

        double total = order.calsTotal();

        System.out.println("Total cost of the order: $" + total);

         */

        HamAndChesePizza g1 = new HamAndChesePizza("small",2,2);
        System.out.println(g1.getDescription());
        PepperoniPizza p1 = new PepperoniPizza("medium",2,3);
        System.out.println(p1.getDescription());
        TropicalPizza t1 = new TropicalPizza("small",1,2,3);
        System.out.println(t1.getDescription());
    }
}
