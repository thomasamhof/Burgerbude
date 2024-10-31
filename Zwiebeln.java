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
}
