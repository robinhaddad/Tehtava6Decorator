public class Punasipuli extends PizzaDecorator {
    public Punasipuli(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public String create(){
        return super.create() + createPunasipuli();
    }

    private String createPunasipuli() {
        return "punasipuli,";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
