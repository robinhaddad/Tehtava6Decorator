public class Tomaattikastike extends PizzaDecorator {
    public Tomaattikastike(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public String create() {
        return super.create() + createTomaattikastike();
    }

    private String createTomaattikastike() {
        return "tomaattikastike,";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.1;
    }
}
