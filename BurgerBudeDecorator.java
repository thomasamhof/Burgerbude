public abstract class BurgerBudeDecorator extends BurgerBude {
    protected BurgerBude decBurgerBude;
    
    public BurgerBudeDecorator(BurgerBude burgerBude){
        this.decBurgerBude = burgerBude;
        this.standort = burgerBude.getStandort();
    }
}
