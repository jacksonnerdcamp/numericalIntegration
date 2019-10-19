public class SimpsonApprox {
    public static double simpsonApproximator()
    {
        double totalSum = 0;
        double xVar;
        double yVar;

        for(int n = 1; n < 10000000; n++)
        {
            xVar = 0.0000006 * n -1.0000003;
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
        return totalSum * 0.0000002;
    }
}
