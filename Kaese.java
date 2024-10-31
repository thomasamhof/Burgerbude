



public class Kaese extends BurgerDecorator {

    
    public Kaese(Burger burger){
        super(burger);
        
        vorbereiten();
    }
    
    
    @Override
    public void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        toppings.add("Relish");
    };
    
}
