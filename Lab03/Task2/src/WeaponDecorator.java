public class WeaponDecorator implements Inventory
{
    private final String weapon;

    public WeaponDecorator(String weapon)
    {
        this.weapon = weapon;
    }

    @Override
    public void equip()
    {
        System.out.println("Спорядження воїна: " + weapon);
    }
}
