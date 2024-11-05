public class ProfessorBurger extends Burger{
    public ProfessorBurger (){
        vorbereiten();
    }
    
    @Override
    public void vorbereiten(){
        setName("Professorburger");
        setBrot(broetchen.Vollkorn);
        verarbeitung();
    }
    
    @Override
    public  void verarbeitung(){
        setBrat(bratling.Doppelt);
        setSauce(soße.ScharfUndKnoblauch);
        toppings.add("Salat");
        toppings.add("Tomate");
        toppings.add("Zwiebeln");
        toppings.add("Kaese");
        toppings.add("Relish");
        toppings.add("Gurke");
        toppings.add("Bacon");
    }

    @Override
    public double kosten(){
        return 6.5;
    }
}
