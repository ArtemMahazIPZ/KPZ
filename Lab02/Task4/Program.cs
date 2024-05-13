using System;

class Program
{
    static void Main(string[] args)
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;

        Virus parentVirus = new Virus(1.5, 10, "Татко-вірус", "Коронавірус");

        Virus child1 = new Virus(0.8, 5, "Вірус Вітя", "Коронавірус");
        Virus child2 = new Virus(0.7, 4, "Вірус Світлана", "Коронавірус");

        parentVirus.Children.Add(child1);
        parentVirus.Children.Add(child2);
        Virus clonedParentVirus = parentVirus.Clone();

        Console.ForegroundColor = ConsoleColor.DarkCyan;
        Console.WriteLine("Вірус-батько:");
        Console.ForegroundColor = ConsoleColor.DarkGreen;
        Console.WriteLine($"Вага: {parentVirus.Weight}");
        Console.WriteLine($"Вік: {parentVirus.Age}");
        Console.WriteLine($"Ім'я: {parentVirus.Name}");
        Console.WriteLine($"Тип: {parentVirus.Type}");
        Console.WriteLine($"Кількість дітей: {parentVirus.Children.Count}");

        Console.ForegroundColor = ConsoleColor.DarkMagenta;
        Console.WriteLine("\nВірус-клон:");
        Console.ForegroundColor = ConsoleColor.DarkGreen;
        Console.WriteLine($"Вага: {clonedParentVirus.Weight}");
        Console.WriteLine($"Вік: {clonedParentVirus.Age}");
        Console.WriteLine($"Ім'я: {clonedParentVirus.Name}");
        Console.WriteLine($"Тип: {clonedParentVirus.Type}");
        Console.WriteLine($"Кількість дітей: {clonedParentVirus.Children.Count}");

        Console.ForegroundColor = ConsoleColor.DarkYellow;
        Console.WriteLine("\nДіти вірусу-клона:");
        foreach (Virus child in clonedParentVirus.Children)
        {
            Console.ForegroundColor = ConsoleColor.DarkGreen;
            Console.WriteLine($"Вага: {child.Weight}");
            Console.WriteLine($"Вік: {child.Age}");
            Console.WriteLine($"Ім'я: {child.Name}");
            Console.WriteLine($"Тип: {child.Type}");
            Console.ResetColor();
        }

    }
}
