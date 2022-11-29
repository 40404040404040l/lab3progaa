public abstract class Person implements IMoves {
    private final String name;
    public int hunger;

    public Person(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Лунатик по имени " + name;
    }

    public void checkHunger() {
        if (getHunger() > 80) {
            System.out.print(" не хочет есть.");
        } else {
            System.out.print(" хочет есть.");
        }
    }
    @Override
    public String talk() {
        return null;
    }

    public void makeDesicionReturn(Planet planet){};

    public void decideToCheck(){};

}
