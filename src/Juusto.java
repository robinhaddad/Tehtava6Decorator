public class Juusto extends PizzaDecorator {
    public Juusto(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public String create() {
        return super.create() +
        createJuusto();
    }

    private String createJuusto() {
        return "juusto,";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.2;
    }
}
