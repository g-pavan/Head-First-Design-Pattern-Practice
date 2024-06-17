import Beverage.AddonDecorator.Choclate;
import Beverage.AddonDecorator.Milk;
import Beverage.Beverage;
import Beverage.Espresso;
import Beverage.Decaf;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " INR " + beverage.cost() + "/-");

        Beverage beverage2 = new Decaf();
        System.out.println(beverage2.getDescription() + " INR " + beverage2.cost() + "/-");

        // Added choclate to Espresso
        beverage = new Choclate(beverage);
        System.out.println(beverage.getDescription() + " INR " + beverage.cost() + "/-");
        // Added choclate again to Espresso
        beverage = new Choclate(beverage);
        System.out.println(beverage.getDescription() + " INR " + beverage.cost() + "/-");

        // Add milk to Decaf
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " INR " + beverage2.cost() + "/-");
    }
}
