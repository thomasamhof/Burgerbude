public class Zwiebeln extends BurgerDecorator {
    public Zwiebeln(Burger burger) {
        super(burger);
    }
    
    public Zwiebeln(Burger burger, boolean toppingHinzugefuegt) {
        super(burger, toppingHinzugefuegt);
        vorbereiten();
    }
    @Override
    public  void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        if (toppingHinzugefuegt) {
            toppings.add("Zwiebeln");
        } else {
            toppings.remove("Zwiebeln");
        }
    };

    @Override
    public double kosten(){
        if (toppingHinzugefuegt)
        return decBurger.kosten()+0.2;
        else
        return decBurger.kosten();
    }
}
