using System.Collections.Generic;

public class DomesticSubscription : Subscription
{
    public DomesticSubscription(double monthlyFee, int minimumPeriod, List<string> channels, List<string> otherFeatures)
        : base(monthlyFee, minimumPeriod, channels, otherFeatures)
    {

    }
}
