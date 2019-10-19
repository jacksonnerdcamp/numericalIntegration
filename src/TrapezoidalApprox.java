
public class TrapezoidalApprox {

    public static double trapezoidalApproximator()
    {
        double partialSum = 0;
        double totalSum = 0;
        double xVal;
        double yVal;

        //notice that n is no longer <=, but < 10000. This is meant to exclude the f( x_10000 ) from the partial sum.
        for(int n = 1; n < 1000000; n++)
        {
            xVal = n * 0.000006 - 1;
            yVal = MidpointApprox.function(xVal);

            partialSum += (2 * yVal);
        }

        //add term 1 and 10000 to partial sum, then multiply it by dx/2
        totalSum = (partialSum + MidpointApprox.function(-1) + MidpointApprox.function(6)) * 0.000003;
        return totalSum;
    }
}