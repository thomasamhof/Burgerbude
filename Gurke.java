public class Gurke extends BurgerDecorator {
    public Gurke(Burger burger){
        super(burger);

        vorbereiten();
    }

    @Override
    public void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        toppings.add("Gurke");
    };

    @Override
    public double kosten(){
        return decBurger.kosten()+0.2;
    }
}
