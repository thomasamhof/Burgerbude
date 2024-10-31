


import java.util.ArrayList;


public abstract class Burger {
    protected String name="";
    
    protected enum soße {KetchupUndSenf, Barbecue, ScharfUndKnoblauch};
    soße sauce = soße.KetchupUndSenf;
    
    protected enum broetchen {Brioche, Vollkorn, keinBroetchen};
    broetchen brot = broetchen.Brioche;
    
    protected enum bratling {Einfach, Doppelt, Haehnchen};
    bratling brat = bratling.Einfach;
    
    ArrayList<String> toppings=new ArrayList<>();
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public soße getSauce() {
        return sauce;
    }

    public void setSauce(soße sauce) {
        this.sauce = sauce;
    }

    public broetchen getBrot() {
        return brot;
    }

    public void setBrot(broetchen brot) {
        this.brot = brot;
    }

    public bratling getBrat() {
        return brat;
    }

    public void setBrat(bratling brat) {
        this.brat = brat;
    }
    
    
    public abstract void vorbereiten();
    
    public abstract void verarbeitung();
    
    public  String verpacken(){
        String ausgabe =String.format("\nName: %s\nBroetchen: %s\nSauce: %s\nBratling: %s\nZutaten: ",getName(), getBrot(),getSauce(),getBrat());
        
        for (String x : toppings) {
            ausgabe = ausgabe.concat(x+",");
        }
        
        return ausgabe+"\n";
    }
    
}
