using System;
using System.Reflection.Emit;

class Program
{
    static void Main(string[] args)
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;

        var heroBuilder = new HeroBuilder()
            .SetName("Артеміус Магазіус")
            .SetHeight(1.8)
            .SetBuild("Атлетична")
            .SetHairColor("Блонд")
            .SetEyeColor("Блакитні")
            .SetClothing("Лицарська броня")
            .SetInventory(new List<string> { "Меч", "Щит", "Зілля" });

        var heroCreator = new CharacterCreator(heroBuilder);
        var hero = heroCreator.CreateCharacter();

        Console.ForegroundColor = ConsoleColor.Green;
        Console.WriteLine("Інформація про героя:");
        Console.ResetColor();
        hero.DisplayInfo();
        Console.WriteLine();

        var enemyBuilder = new EnemyBuilder()
             .SetName("Констатінус Поганіус")
            .SetHeight(2.0)
            .SetBuild("Мускулиста")
            .SetHairColor("Чорний")
            .SetEyeColor("Червоні")
            .SetClothing("Мантія")
            .SetInventory(new List<string> { "Палиця", "Книга чорної магії" });

        var enemyCreator = new CharacterCreator(enemyBuilder);
        var enemy = enemyCreator.CreateCharacter();

        Console.ForegroundColor = ConsoleColor.Red;
        Console.WriteLine("\nІнформація про ворога:");
        Console.ResetColor();
        enemy.DisplayInfo();
    }
}
