import java.util.ArrayList;

public class Relish extends BurgerDecorator {
    public Relish(Burger burger) {
        super(burger);
        vorbereiten();
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
        ArrayList<String> standardZutaten = BurgerFactory.getInstance().erstelleBurger(decBurger.getName()).toppings;
        String zutat = this.getClass().getName();

        if (toppingHinzugefuegt){
            toppings.add("Relish");
            // es wird geprüft, ob die zutat bereits auf dem standard burger war oder manuell hinzugefügt wurde
            manuellErgaenzt = (decBurger.toppings.contains(zutat) && !standardZutaten.contains(zutat) || standardZutaten.contains(zutat) && decBurger.toppings.indexOf(zutat)!=decBurger.toppings.lastIndexOf(zutat)) ? true : false;
        } else {
            manuellErgaenzt = (decBurger.toppings.contains(zutat) && !standardZutaten.contains(zutat) || standardZutaten.contains(zutat) && decBurger.toppings.indexOf(zutat)!=decBurger.toppings.lastIndexOf(zutat)) ? true : false;
            toppings.remove("Relish");
        }
    };

    @Override
    public double kosten(){
        if (toppingHinzugefuegt && manuellErgaenzt)
            return decBurger.kosten()+0.3;
        else if (manuellErgaenzt)
            return decBurger.kosten()-0.3;
        else
        return decBurger.kosten();
    }
}
