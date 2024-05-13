using System.Collections.Generic;

public class PremiumSubscription : Subscription
{
    public PremiumSubscription(double monthlyFee, int minimumPeriod, List<string> channels, List<string> otherFeatures)
        : base(monthlyFee, minimumPeriod, channels, otherFeatures)
    {

    }
}
