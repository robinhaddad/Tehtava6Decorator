public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaToBeDecorated;

    public PizzaDecorator (Pizza pizzaToBeDecorated){
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }

    public String create(){
        return pizzaToBeDecorated.create(); //delegointi sisukselle
    }

    public double getPrice() {
        return pizzaToBeDecorated.getPrice(); //delegointi
    }
}
