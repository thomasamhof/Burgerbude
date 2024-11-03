public class Kaese extends BurgerDecorator {
    public Kaese(Burger burger) {
        super(burger);
        vorbereiten();
    }
    
    public Kaese(Burger burger, boolean toppingHinzugefuegt) {
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
            toppings.add("Käse");
        } else {
            toppings.remove("Käse");
        }
    };

    @Override
    public double kosten(){
        if (toppingHinzugefuegt)
            return decBurger.kosten() + 0.4;
        else
            return decBurger.kosten();
    }
}
