using System;
using System.Collections.Generic;

public class Character
{
    public string Name { get; set; }
    public double Height { get; set; }
    public string Build { get; set; }
    public string HairColor { get; set; }
    public string EyeColor { get; set; }
    public string Clothing { get; set; }
    public List<string> Inventory { get; set; }

    public void DisplayInfo()
    {
        Console.WriteLine($"Як звати: {Name}");
        Console.WriteLine($"Зріст: {Height} м");
        Console.WriteLine($"Тілобудова: {Build}");
        Console.WriteLine($"Колір волосся: {HairColor}");
        Console.WriteLine($"Колір очей: {EyeColor}");
        Console.WriteLine($"Одяг: {Clothing}");
        Console.WriteLine("Інвентар:");
        foreach (var item in Inventory)
        {
            Console.WriteLine($"- {item}");
        }
    }
}
