using System;
using System.Collections.Generic;

public class DeviceFactory
{
    public Device CreateDevice(string deviceType, string brand)
    {
        switch (deviceType)
        {
            case "Ноутбук":
                return new Laptop(brand);
            case "Нетбук":
                return new Netbook(brand);
            case "Електронна книжка":
                return new EBook(brand);
            case "Смартфон":
                return new Smartphone(brand);
            default:
                throw new ArgumentException("Щось незрозуміле :(");
        }
    }
}
