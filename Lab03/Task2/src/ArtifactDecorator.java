public class ArtifactDecorator implements Inventory {
    private final String artifact;

    public ArtifactDecorator(String artifact) {
        this.artifact = artifact;
    }

    @Override
    public void equip() {
        System.out.println("Спорядження паладіна: " + artifact);
    }
}
