public class Relish extends BurgerDecorator {
    public Relish(Burger burger) {
        super(burger);
    }
    
    public Relish(Burger burger, boolean toppingHinzugefuegt) {
        super(burger, toppingHinzugefuegt);
        vorbereiten();
    }

    @Override
    public void vorbereiten(){
        verarbeitung();
    }
    
    @Override
    public  void verarbeitung(){
        if (toppingHinzugefuegt) {
            toppings.add("Relish");
        } else {
            toppings.remove("Relish");
        }
    };

    @Override
    public double kosten(){
        if (toppingHinzugefuegt)
            return decBurger.kosten() + 0.3;
        else
            return decBurger.kosten();
    }
}
