public class BurgerBudeVegan extends BurgerBudeDecorator {
    private static BurgerBudeVegan burgerBudeVegan = null;

    private BurgerBudeVegan(BurgerBude burgerbude) {
        super(burgerbude);
        this.standort = burgerbude.getStandort() + " - hier werden nur vegane Speisen serviert";
    }

    public static BurgerBudeVegan getInstance(BurgerBude _burgerbude) {
        if (burgerBudeVegan == null) {
            burgerBudeVegan = new BurgerBudeVegan(_burgerbude);
        }

        return burgerBudeVegan;
    }
}
