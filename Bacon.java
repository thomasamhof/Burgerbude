public class Bacon extends BurgerDecorator {

    
    public Bacon(Burger burger){
        super(burger);
        vorbereiten();
    }

    public Bacon(Burger burger, boolean toppingHinzugefuegt){
        super(burger, toppingHinzugefuegt);
        vorbereiten();
    }   
    
    
    @Override
    public  void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        if (toppingHinzugefuegt){
            toppings.add("Bacon");
        } else {
            toppings.remove("Bacon");
        }
    };

    @Override
    public double kosten(){
        if (toppingHinzugefuegt)
        return decBurger.kosten()+0.5;
        else
        return decBurger.kosten();
    }
}
