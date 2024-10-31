


import java.util.ArrayList;


public class BurgerBude {
    protected String standort="";
    protected ArrayList<Burger> bestellungen=new ArrayList<>();

    public BurgerBude() {
    }
    
    public BurgerBude(String standort){
        this.standort = standort;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }
    
    public void bestelleBurger(Burger burger){
        bestellungen.add(burger);
    }
    
    public void fertigeBurger(Burger burger){
        System.out.println("Burgerbude "+getStandort());
        System.out.println(burger.verpacken());
    }
    
    public void fertigeBurger(){
        
        System.out.println("Burgerbude "+getStandort());
        
        for (Burger x : bestellungen) {
            System.out.println(x.verpacken());
        }
    }
    
}
