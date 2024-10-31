public class Chickenburger extends Burger{
    public Chickenburger (){
        vorbereiten();
    }
    
    @Override
    public void vorbereiten(){
        setName("Chickenburger");
        setBrot(broetchen.Brioche);
        verarbeitung();
    }
    
    @Override
    public  void verarbeitung(){
        setBrat(brat);
        setSauce(soße.Barbecue);
        toppings.add("Salat");
        toppings.add("Tomate");
        toppings.add("Zwiebeln");
    }
}
