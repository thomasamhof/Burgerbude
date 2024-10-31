public class Cheeseburger extends Burger{
    public Cheeseburger (){
        vorbereiten();
    }
    
    @Override
    public void vorbereiten(){
        setName("Cheeseburger");
        setBrot(broetchen.Brioche);
        verarbeitung();
    }
    
    @Override
    public  void verarbeitung(){
        setBrat(brat);
        setSauce(soße.KetchupUndSenf);
        toppings.add("Gurke");
        toppings.add("Kaese");
    }

    @Override
    public double kosten(){
        return 4.5;
    }
}
