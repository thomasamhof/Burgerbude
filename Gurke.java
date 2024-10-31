public class Gurke extends BurgerDecorator {
    public Gurke(Burger burger){
        super(burger);

        vorbereiten();
    }

    @Override
    public void vorbereiten(){
        verarbeitung();
        }
    
    @Override
    public  void verarbeitung(){
        toppings.add("Gurke");
    };
}
