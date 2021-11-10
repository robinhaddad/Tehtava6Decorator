public class Main {
    public static void main(String[] args){

        Pizza firstPizza = new Ananas(new Kinkku(new Pizzapohja()));
        System.out.println(firstPizza.create());
        System.out.printf("%.2f",firstPizza.getPrice());

        Pizza secondPizza = new Tomaattikastike(
                new Punasipuli(new Kinkku(new Ananas(new Pizzapohja()))));
        System.out.println("\n"+secondPizza.create());
        System.out.printf("%.2f",secondPizza.getPrice());

        Pizza thirdPizza = new Tomaattikastike(new Juusto(new Pizzapohja()));
        System.out.println("\n"+thirdPizza.create());
        System.out.printf("%.2f",thirdPizza.getPrice());
    }
}
