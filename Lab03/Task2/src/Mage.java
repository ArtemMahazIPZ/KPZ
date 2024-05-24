public class Mage
{
    private final String name;
    public Mage(String name) {
        this.name = name;
    }
    public void castSpell()
    {
        System.out.println("Маг наведе прокляття!");
    }
    public void displayName()
    {
        System.out.println("Ім'я мага: " + this.name);
    }
}
