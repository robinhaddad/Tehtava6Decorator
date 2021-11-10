public class Ananas extends PizzaDecorator {
    public Ananas(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public String create() {
        return super.create() // abstraktin luokan delegointimetodin kutsu
        + createAnanas();   // lisätty toiminnallisuus

    }

    private String createAnanas() {
        return "ananas,";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }
}
