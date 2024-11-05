import java.util.ArrayList;

public abstract class BurgerDecorator extends Burger {
    protected Burger decBurger;
    protected boolean toppingHinzugefuegt = true;
    protected boolean manuellErgaenzt = false;
    
    public BurgerDecorator(Burger burger){
        this.decBurger = burger;
        this.name = burger.name;
        this.brot = burger.brot;
        this.sauce = burger.sauce;
        this.toppings = burger.toppings;
        this.brat = burger.brat;
    }

    public BurgerDecorator(Burger burger, boolean toppingHinzugefuegt){
        this.decBurger = burger;
        this.toppingHinzugefuegt = toppingHinzugefuegt;
        this.name = burger.name;
        this.brot = burger.brot;
        this.sauce = burger.sauce;
        this.toppings = burger.toppings;
        this.brat = burger.brat;
    }
    
    @Override
    public abstract void vorbereiten();
    
    @Override
    public abstract void verarbeitung();

    //prüft über einen Vergleich der Arrays, ob die Zutat vorher manuell hinzugefügt wurde
    public void wurdeErgaenzt(){
        String zutat = this.getClass().getName(); 
        ArrayList<String> standardZutaten = BurgerFactory.getInstance().erstelleBurger(decBurger.getClass().getName()).toppings;
        if (decBurger.toppings.contains(zutat) && !standardZutaten.contains(zutat) || standardZutaten.contains(zutat) && decBurger.toppings.indexOf(zutat)!=decBurger.toppings.lastIndexOf(zutat)) {
           
        } 
    };
}
