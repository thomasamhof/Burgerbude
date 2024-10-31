public class Zwiebeln extends BurgerDecorator {
    public Zwiebeln(Burger burger){
        super(burger);
        vorbereiten();
    }
    @Override
    public  void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        toppings.add("Zwiebeln");
    };

    @Override
    public double kosten(){
        return decBurger.kosten()+0.2;
    }
}
