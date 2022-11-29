public enum EFood {
    COSMICMEAT(20, true),
    THE_SECOND_DISH(30, true),
    THE_THIRD_DISH(0, false),
    THE_FOURTH_DISH(0, false),
    THE_FIFTH_DISH(70, true);


    protected int calories;
    protected Boolean edible;

    EFood(int calories, Boolean edible) {
        this.calories = calories;
        this.edible = edible;
    }

    public Boolean getEdible() {
        return edible;
    }

    public int getCalories() {
        return calories;
    }
}
