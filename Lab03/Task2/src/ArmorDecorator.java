public class ArmorDecorator implements Inventory {
    private final String armor;

    public ArmorDecorator(String armor) {
        this.armor = armor;
    }

    @Override
    public void equip() {
        System.out.println("Спорядження мага: " + armor);
    }
}
