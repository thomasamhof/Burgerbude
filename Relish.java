public class Relish extends BurgerDecorator {
    public Relish(Burger burger){
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

    @Override
    public double kosten(){
        return decBurger.kosten()+0.4;
    }
}
