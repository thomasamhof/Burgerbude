


public class BurgerBudeVegan extends BurgerBudeDecorator{
    
    public BurgerBudeVegan(BurgerBude burgerbude){
        super(burgerbude);
        this.standort=burgerbude.getStandort()+" - hier werden nur vegane Speisen serviert";
    }
    
}
