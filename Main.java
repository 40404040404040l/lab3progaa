public class Main {
    public static void main(String[] args) {
        Planet Earth = new Planet ("Earth", 0);

        Person ponchik = new Ponchik("Ponchik", 0);

        System.out.print(ponchik.getName() + ponchik.talk());
        ponchik.makeDesicionReturn(Earth);

        Person neznaika = new Neznaika("Neznaika", 81);

        System.out.print(neznaika.getName() + " и " + ponchik.getName());
        ChangeLocation newplace = new ChangeLocation();
        newplace.goTo(ELocations.FOODSTORAGE);

        System.out.print(neznaika.getName());
        neznaika.checkHunger();
        System.out.print(" Но ");
        neznaika.eat(EFood.COSMICMEAT);

        System.out.print(ponchik.getName());
        ponchik.decideToCheck();
        System.out.print(ponchik.getName());
        ponchik.eat(EFood.COSMICMEAT);
        System.out.print(ponchik.getName());
        ponchik.eat(EFood.THE_SECOND_DISH);
        System.out.print(ponchik.getName());
        ponchik.eat(EFood.THE_FIFTH_DISH);
        System.out.print(ponchik.getName());
        ponchik.eat(EFood.THE_THIRD_DISH);
        System.out.print(ponchik.getName());
        ponchik.eat(EFood.THE_FOURTH_DISH);
    }
}