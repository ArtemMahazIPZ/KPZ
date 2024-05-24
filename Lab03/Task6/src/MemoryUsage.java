public class MemoryUsage {
    public static void printMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Використана пам'ять: " + usedMemory / 1024 + " KB");
    }
}
