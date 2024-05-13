public class Laptop : Device
{
    public Laptop(string brand) : base(brand, "Laptop") { }

    public override void DisplayInfo()
    {
        Console.WriteLine($"Торгова марка: {Brand}, тип девайсу: {Type}");
    }
}