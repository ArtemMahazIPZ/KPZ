using System.Collections.Generic;

public class EducationalSubscription : Subscription
{
    public EducationalSubscription(double monthlyFee, int minimumPeriod, List<string> channels, List<string> otherFeatures)
        : base(monthlyFee, minimumPeriod, channels, otherFeatures)
    {

    }
}
