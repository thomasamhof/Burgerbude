public class newMain {
    public static void main(String[] args) {
       BurgerBude nbg = BurgerBudeFleisch.getInstance(new BurgerBude("Nuernberg"));
       BurgerBude erl = BurgerBudeVegan.getInstance(new BurgerBude("Erlangen"));
       
       nbg.bestelleBurger(new Bacon(new Relish(new Chickenburger())));
       nbg.bestelleBurger(new Tomate(new Gurke(new Cheeseburger())));
       nbg.bestelleBurger(new ProfessorBurger());
       
       erl.bestelleBurger(new Kaese(new Zwiebeln(new Hamburger())));
       erl.bestelleBurger(new Relish(new Cheeseburger()));
       erl.bestelleBurger(new Kaese(new Chickenburger()));

       nbg.fertigeBurger();
       erl.fertigeBurger();
    }
}
