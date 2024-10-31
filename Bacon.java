public class Bacon extends BurgerDecorator {

    
    public Bacon(Burger burger){
        super(burger);
        vorbereiten();
    }
    
    
    @Override
    public  void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        toppings.add("Bacon");
    };

    @Override
    public double kosten(){
        return decBurger.kosten()+0.5;
    }
}
