public class SimpsonApprox {
    public static double simpsonApproximator()
    {
        double totalSum = 0;
        double xVar;
        double yVar;
        // delta x is 100 times smaller than in the midpoint approximation.
        for(int n = 1; n < 1000000; n++)
        {
            // x_1 is
            xVar = 0.000006 * n - 1;
            yVar = MidpointApprox.function(xVar);

            if(n % 2 == 1)
            {
                totalSum += yVar * 4;
            }
            else{
                totalSum += yVar * 2;
            }
        }
        totalSum += (MidpointApprox.function(-1) + MidpointApprox.function(6));
        return totalSum * 0.000002;
    }
}
