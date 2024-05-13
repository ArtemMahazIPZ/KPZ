using System;

class Program
{
    static void Main(string[] args)
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;
        Authenticator authenticator1 = Authenticator.GetInstance();
        Authenticator authenticator2 = Authenticator.GetInstance();

    
        if (authenticator1 == authenticator2)
        {
            Console.WriteLine("Це один і той же екземпляр Authenticator!");
        }
        else
        {
            Console.WriteLine("Це різні екземпляри Authenticator!");
        }
    }
}
