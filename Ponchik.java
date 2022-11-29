public class Ponchik extends Person implements IMoves {
    public Ponchik(String name, int hunger) {
        super(name, hunger);
    }
    @Override
    public void makeDesicionReturn(Planet planet){
        if (planet.getChance() < 20) {
            System.out.println("\"о возвращении на Землю не может быть никакой речи\". ");
        }
        else {
            System.out.print("пора вернуться домой");
        }
    }
    FoodMethods foodmethods = new FoodMethods();

    @Override
    public void eat(EFood food) {

        if ((getHunger() >= 100)) {
            System.out.println(" наелся. Проверка окончена.");
        }
        else if (foodmethods.checkEdible(food))  {
            hunger += foodmethods.getCaloriesOf(food);
            System.out.println(" съел " + food + ".");
        }
        else if (!foodmethods.checkEdible(food)) {
            System.out.println(food + " is inedible.");
        }


    }



    @Override
    public String talk() {
        return " сказал: ";
    }
    @Override
    public void decideToCheck(){
        System.out.println(" заявил, что необходимо проверить качество провизии.");
    }
}
