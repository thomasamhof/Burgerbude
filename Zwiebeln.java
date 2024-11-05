import java.util.ArrayList;

public class Zwiebeln extends BurgerDecorator {
    public Zwiebeln(Burger burger) {
        super(burger);
        vorbereiten();
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
        ArrayList<String> standardZutaten = BurgerFactory.getInstance().erstelleBurger(decBurger.getName()).toppings;
        String zutat = this.getClass().getName();

        if (toppingHinzugefuegt){
            toppings.add("Zwiebeln");
            // es wird geprüft, ob die zutat bereits auf dem standard burger war oder manuell hinzugefügt wurde
            manuellErgaenzt = (decBurger.toppings.contains(zutat) && !standardZutaten.contains(zutat) || standardZutaten.contains(zutat) && decBurger.toppings.indexOf(zutat)!=decBurger.toppings.lastIndexOf(zutat)) ? true : false;
        } else {
            manuellErgaenzt = (decBurger.toppings.contains(zutat) && !standardZutaten.contains(zutat) || standardZutaten.contains(zutat) && decBurger.toppings.indexOf(zutat)!=decBurger.toppings.lastIndexOf(zutat)) ? true : false;
            toppings.remove("Zwiebeln");
        }
    };

    @Override
    public double kosten(){        
        if (toppingHinzugefuegt && manuellErgaenzt)
            return decBurger.kosten()+0.2;
        else if (manuellErgaenzt)
            return decBurger.kosten()-0.2;
        else
        return decBurger.kosten();
    }
}
