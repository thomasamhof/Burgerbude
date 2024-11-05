public class BurgerFactory {
    private static BurgerFactory burgerFabrik = null;

    private BurgerFactory() {}

    public static BurgerFactory getInstance() {
        if (burgerFabrik == null) {
            burgerFabrik = new BurgerFactory();
        }

        return burgerFabrik;
    }

    public Burger erstelleBurger(String name) {
        if (name.equalsIgnoreCase("hamburger")) 
            return new Hamburger();
        else if (name.equalsIgnoreCase("cheeseburger"))
            return new Cheeseburger();
        else if (name.equalsIgnoreCase("chickenburger"))
            return new Chickenburger();
        else if (name.equalsIgnoreCase("professorburger"))
            return new ProfessorBurger();
        else 
            return null;
    }

    public Burger belegeBurger(String name, Burger burger) {
        switch (name) {
            case "b+":
                return new Bacon(burger);
            case "b-":
                return new Bacon(burger, false);
            case "g+":
                return new Gurke(burger);
            case "g-":
                return new Gurke(burger, false);
            case "k+":
                return new Kaese(burger);
            case "k-":
                return new Kaese(burger, false);
            case "r+":
                return new Relish(burger);
            case "r-":
                return new Relish(burger, false);
            case "t+":
                return new Tomate(burger);
            case "t-":
                return new Tomate(burger, false);
            case "z+":
                return new Zwiebeln(burger);
            case "z-":
                return new Zwiebeln(burger, false);
            default:
                return burger;
        }
    }
}