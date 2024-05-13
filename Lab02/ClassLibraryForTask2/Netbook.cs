public class Netbook : Device
{
    public Netbook(string brand) : base(brand, "Netbook") { }

    public override void DisplayInfo()
    {
        Console.WriteLine($"Торгова марка: {Brand}, тип девайсу: {Type}");
    }
}