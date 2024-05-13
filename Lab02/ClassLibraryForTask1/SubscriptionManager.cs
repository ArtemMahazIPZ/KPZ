using System.Collections.Generic;


public class SubscriptionManager
{
    public Subscription PurchaseSubscriptionViaWebSite()
    {
        return new DomesticSubscription(10.0, 1, new List<string> { "Кухар Рішельє", "Сімейний" }, new List<string> { "Знижка для родин військових", "Знижка для багатодітних сімей" });
    }

    public Subscription PurchaseSubscriptionViaMobileApp()
    {
        return new EducationalSubscription(15.0, 3, new List<string> { "Кодувальник", "Дебагер" }, new List<string> { "Знижка для студентів Політеху", "Подвійна знижка для відмінників" });
    }

    public Subscription PurchaseSubscriptionViaManagerCall()
    {
        return new PremiumSubscription(300, 6, new List<string> { "Супер багатій", "Банкомат" }, new List<string> { "Показ без реклами", "Іноземні канали" });
    }
}
