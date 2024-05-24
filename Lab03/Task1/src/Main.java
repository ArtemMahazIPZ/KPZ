import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new Logger();
        consoleLogger.log("Це повідомлення журналу.");
        consoleLogger.error("Ой-ой-ой! Сталася помилка...");
        consoleLogger.warn("Я Вас попереджаю, шановний!");

        try {
            FileLoggerAdapter fileLogger = new FileLoggerAdapter("log.txt");
            fileLogger.log("Це повідомлення журналу.");
            fileLogger.error("Ой-ой-ой! Сталася помилка...");
            fileLogger.warn("Я Вас попереджаю, шановний!");
            fileLogger.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
