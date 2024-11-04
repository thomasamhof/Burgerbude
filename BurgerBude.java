import java.util.ArrayList;

public class BurgerBude {
    protected String standort = "";
    protected ArrayList<Burger> bestellungen = new ArrayList<>();
    protected double geskosten = 0;

    public BurgerBude() {}
    
    public BurgerBude(String standort) {
        this.standort = standort;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public double getGeskosten() {
        return geskosten;
    }

    public void setGeskosten(double geskosten) {
        this.geskosten = geskosten;
    }

    
    
    public void bestelleBurger(Burger burger) {
        bestellungen.add(burger);
    }
    
    public void fertigeBurger(Burger burger) {
        System.out.println("Burgerbude " + getStandort());
        System.out.println(burger.verpacken());
    }
    
    public String fertigeBurger() {
        String ausgabe = "Burgerbude " + getStandort()+"\n";
        
        for (Burger x : bestellungen) {
            ausgabe = ausgabe.concat(x.verpacken());
        }
        ausgabe = ausgabe.concat(String.format("\n\nGesamtkosten der Bestellung: %.2f",getGeskosten()));
        return ausgabe;
    }
}
