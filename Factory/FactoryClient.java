import Pizza.Pizza;
import FactoryMethod.BlrPizzaStore.BlrPizzaStore;
import FactoryMethod.DelhiPizzaStore.DelhiPizzaStore;
import FactoryMethod.HydPizzaStore.HydPizzaStore;
import PizzaStore.PizzaStore;

public class FactoryClient {
    public static void main(String[] args) {
        PizzaStore blrPizzaStore = new BlrPizzaStore();
        PizzaStore delhiPizzaStore = new DelhiPizzaStore();
        PizzaStore hydPizzaStore = new HydPizzaStore();

        Pizza pizza = blrPizzaStore.orderPizza("cheese");
        System.out.println("Pavan ordered a " + pizza.getName() + "\n");

        pizza = delhiPizzaStore.orderPizza("veggie");
        System.out.println("Khushboo ordered a " + pizza.getName() + "\n");

        pizza = hydPizzaStore.orderPizza("cheese");
        System.out.println("Keerthi ordered a " + pizza.getName() + "\n");
    }
}
