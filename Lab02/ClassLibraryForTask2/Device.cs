public abstract class Device
{
    public string Brand { get; }
    public string Type { get; }

    protected Device(string brand, string type)
    {
        Brand = brand;
        Type = type;
    }

    public abstract void DisplayInfo();
}