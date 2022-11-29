public class FoodMethods implements IFood{
    public Boolean checkEdible(EFood food) {
        return food.getEdible();
    }

    public int getCaloriesOf(EFood food) {
        return food.getCalories();
    }
}
