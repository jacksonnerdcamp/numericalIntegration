public class MidpointApprox {

    public static double function(double x)
    {
        double output = java.lang.Math.exp(-1 * (Math.pow(x, 2))) + Math.pow(x, 3);
        return output;
    }

    public static double midpointApproximator(){
        // this will be the output approximation
        double totalSum = 0;

        // defining the x and y values in terms of the specific iteration
        double xVal;
        double yVal;

        // the for loop iterates through sigma, adding to totalSum as it goes
        for(int n = 1; n <= 10000; n++){
            xVal = (0.0006 * n) - 1.0003;
            yVal = function(xVal);
            totalSum += yVal * 0.0006;
        }
        return totalSum;
    }
}
