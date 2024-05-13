using System;

class Program
{
    static void Main(string[] args)
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;

        var manager = new SubscriptionManager();

        var subscription1 = manager.PurchaseSubscriptionViaWebSite();
        var subscription2 = manager.PurchaseSubscriptionViaMobileApp();
        var subscription3 = manager.PurchaseSubscriptionViaManagerCall();

        Console.ForegroundColor = ConsoleColor.Green;
        Console.WriteLine("Які канали доступні за домашньою підпискою:");
        Console.ResetColor();

        Console.ForegroundColor = ConsoleColor.Blue;
        foreach (var channel in subscription1.Channels)
            Console.Write(channel + "      ");
        Console.WriteLine();
        Console.ResetColor();

        Console.ForegroundColor = ConsoleColor.Red;
        Console.WriteLine("Що вам пропонує студентська підписка:");
        Console.ResetColor();

        Console.ForegroundColor = ConsoleColor.Yellow;
        foreach (var feature in subscription2.OtherFeatures)
            Console.Write(feature + "       ");
        Console.WriteLine();
        Console.ResetColor();

        Console.ForegroundColor = ConsoleColor.Magenta;
        Console.WriteLine($"Платіть щомісяця за преміальну підписку: {subscription3.MonthlyFee}");
        Console.ResetColor();

        Console.ReadLine();
    }
}
