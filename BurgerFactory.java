public class BurgerFactory {

    public Burger erstelleBurger(String name) {
        if (name.equalsIgnoreCase("ham")) 
            return new Hamburger();
        else if (name.equalsIgnoreCase("cheeese"))
            return new Cheeseburger();
        else if (name.equalsIgnoreCase("chicken"))
            return new Chickenburger();
        else if (name.equalsIgnoreCase("prof"))
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