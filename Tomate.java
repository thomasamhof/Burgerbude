public class Tomate extends BurgerDecorator {
    public Tomate(Burger burger) {
        super(burger);
    }

    public Tomate(Burger burger, boolean toppingHinzugefuegt) {
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
            toppings.add("Tomate");
        } else {
            toppings.remove("Tomate");
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
