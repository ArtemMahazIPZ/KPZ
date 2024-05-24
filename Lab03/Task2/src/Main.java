public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Святослав");
        Mage mage = new Mage("Старий Мага");
        Paladin paladin = new Paladin("Максиміліан");

        warrior.displayName();
        mage.displayName();
        paladin.displayName();
        System.out.println("\n");
        Inventory warriorInventory = new WeaponDecorator("Меч Героя");
        Inventory mageInventory = new ArmorDecorator("Чорний Посох");
        Inventory paladinInventory = new ArtifactDecorator("Імператорський Щит");
        System.out.println("\n");
        warriorInventory.equip();
        mageInventory.equip();
        paladinInventory.equip();
        System.out.println("\n");
        warrior.attack();
        mage.castSpell();
        paladin.smite();
    }
}
