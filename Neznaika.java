public class Neznaika extends Person implements IMoves {
    public Neznaika(String name, int hunger) {
        super(name, hunger);
    }

    @Override
    public void eat(EFood food) {
            System.out.println(getName() + " поддержал друга и съел " + food + ".");
    }
}