public abstract class BurgerDecorator extends Burger {
    protected Burger decBurger;
    protected boolean toppingHinzugefuegt = true;
    
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
}
