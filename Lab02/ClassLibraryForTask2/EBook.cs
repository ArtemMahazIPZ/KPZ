public class EBook : Device
{
    public EBook(string brand) : base(brand, "EBook") { }

    public override void DisplayInfo()
    {
        Console.WriteLine($"Торгова марка: {Brand}, тип девайсу: {Type}");
    }
}