public class Gurke extends BurgerDecorator {
    public Gurke(Burger burger) {
        super(burger);
        vorbereiten();
    }

    public Gurke(Burger burger, boolean toppingHinzugefuegt) {
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
            toppings.add("Gurke");
        } else {
            toppings.remove("Gurke");
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
