
public class TrapezoidalApprox {

    public static double trapezoidalApproximator()
    {
        double partialSum = 0;
        double totalSum = 0;
        double xVal;
        double yVal;

        /* the for loop had to be tweaked here. delta x is smaller by a factor of 100 than in midpoint approx. n_max is
        1000000 - 1. */
        for(int n = 1; n < 1000000; n++)
        {
            // x_1 is -0.999994
            xVal = n * 0.000006 - 1;
            yVal = MidpointApprox.function(xVal);

            partialSum += (2 * yVal);
        }

        //add the first and last yVal to partial sum, then multiply it by dx/2
        totalSum = (partialSum + MidpointApprox.function(-1) + MidpointApprox.function(6)) * 0.000003;
        return totalSum;
    }
}