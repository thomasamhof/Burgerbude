public class BurgerBudeFleisch extends BurgerBudeDecorator{
    public BurgerBudeFleisch(BurgerBude burgerbude){
        super(burgerbude);
        this.standort = burgerbude.getStandort() + " - hier wird nur Fleisch serviert";
    }
}
