public class Tomate extends BurgerDecorator {
    public Tomate(Burger burger){
        super(burger);
        
        vorbereiten();
    }

    @Override
    public void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        toppings.add("Tomate");
    };

    @Override
    public double kosten(){
        return decBurger.kosten()+0.3;
    }
}
