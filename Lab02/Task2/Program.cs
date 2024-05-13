using System;

class Program
{
    static void Main(string[] args)
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;
        var factory = new DeviceFactory();

        var smartphone1 = factory.CreateDevice("Смартфон", "IProne");
        var smartphone2 = factory.CreateDevice("Смартфон", "Balaxy");
        var ebook = factory.CreateDevice("Електронна книжка", "Kiaomi");
        var laptop = factory.CreateDevice("Ноутбук", "Kiaomi");
        var netbook = factory.CreateDevice("Нетбук", "Balaxy");

        Console.ForegroundColor = ConsoleColor.Yellow;
        smartphone1.DisplayInfo();
        smartphone2.DisplayInfo();
        Console.ResetColor();

        Console.ForegroundColor = ConsoleColor.Green;
        ebook.DisplayInfo();
        Console.ResetColor();

        Console.ForegroundColor = ConsoleColor.Blue;
        laptop.DisplayInfo();
        Console.ResetColor();

        Console.ForegroundColor = ConsoleColor.Red;
        netbook.DisplayInfo();
        Console.ResetColor();

        Console.ReadLine();
    }
}
