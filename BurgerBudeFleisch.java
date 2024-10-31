public class BurgerBudeFleisch extends BurgerBudeDecorator{
    private static BurgerBudeFleisch burgerBudeFleisch = null;

    private BurgerBudeFleisch(BurgerBude burgerbude){
        super(burgerbude);
        this.standort = burgerbude.getStandort() + " - hier wird nur Fleisch serviert";
    }

    public static BurgerBudeFleisch getInstance(BurgerBude _burgerbude) {
        if (burgerBudeFleisch == null) {
            burgerBudeFleisch = new BurgerBudeFleisch(_burgerbude);
        }

        return burgerBudeFleisch;
    }
}
