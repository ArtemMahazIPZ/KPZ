public class Warrior
{
    private final String name;
    public Warrior(String name) {
        this.name = name;
    }
    public void attack()
    {
        System.out.println("Воїн рубає ворогів своїм мечем.");
    }
    public void displayName()
    {
        System.out.println("Ім'я воїна: " + this.name);
    }
}
