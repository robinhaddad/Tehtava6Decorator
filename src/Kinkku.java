public class Kinkku extends PizzaDecorator {
    public Kinkku(Pizza pizzaToBeDecorated){
        super(pizzaToBeDecorated);
    }

    @Override
    public String create() {
        return super.create() + createKinkku();
    }

    private String createKinkku() {
        return "kinkku,";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.7;
    }
}
