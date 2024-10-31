



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
    
}
