public class Planet {

    private int chance_return_to_Earth;
    private String name;

    public Planet(String name, int chance_return_to_Earth) {
        this.name = name;
        this.chance_return_to_Earth = chance_return_to_Earth;
    }

    public int getChance() {
        return chance_return_to_Earth;
    }

    public String getName() {
        return name;
    }

}
