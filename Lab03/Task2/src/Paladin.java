public class Paladin
{
    private final String name;
    public Paladin(String name) {
        this.name = name;
    }
    public void smite()
    {
        System.out.println("Паладін вражає своїх ворогів!");
    }
    public void displayName()
    {
        System.out.println("Ім'я паладіна: " + this.name);
    }
}
