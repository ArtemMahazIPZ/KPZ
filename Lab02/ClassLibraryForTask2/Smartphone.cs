public class Smartphone : Device
{
    public Smartphone(string brand) : base(brand, "Smartphone") { }

    public override void DisplayInfo()
    {
        Console.WriteLine($"Торгова марка: {Brand}, тип девайсу: {Type}");
    }
}