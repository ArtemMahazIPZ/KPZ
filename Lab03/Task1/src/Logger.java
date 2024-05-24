public class Logger {
    public void log(String message) {
        System.out.println("\u001B[32m" + message + "\u001B[0m");
    }

    public void error(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m");
    }

    public void warn(String message) {
        System.out.println("\u001B[33m" + message + "\u001B[0m");
    }
}
