



public abstract class BurgerDecorator extends Burger {
    protected Burger decBurger;
    
    public BurgerDecorator(Burger burger){
        this.decBurger = burger;
        this.name=burger.name;
        this.brot=burger.brot;
        this.sauce=burger.sauce;
        this.toppings=burger.toppings;
    }
    
    @Override
    public abstract void vorbereiten();
    
    @Override
    public abstract void verarbeitung();
    
    
    
}
