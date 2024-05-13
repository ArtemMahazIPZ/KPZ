using System.Collections.Generic;

public abstract class Subscription
{
    public double MonthlyFee { get; }
    public int MinimumPeriod { get; }
    public List<string> Channels { get; }
    public List<string> OtherFeatures { get; }

    public Subscription(double monthlyFee, int minimumPeriod, List<string> channels, List<string> otherFeatures)
    {
        MonthlyFee = monthlyFee;
        MinimumPeriod = minimumPeriod;
        Channels = channels;
        OtherFeatures = otherFeatures;
    }
}
