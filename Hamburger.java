public class Hamburger extends Burger{
    public Hamburger (){
        vorbereiten();
    }
    
    @Override
    public void vorbereiten(){
        setName("Hamburger");
        setBrot(broetchen.Brioche);
        verarbeitung();
    }
    
    @Override
    public void verarbeitung(){
        setBrat(brat);
        setSauce(soße.KetchupUndSenf);
        toppings.add("Gurke");
    }

    @Override
    public double kosten(){
        return 4.0;
    }
}
