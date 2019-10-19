public class Runner {
    public static void main(String[] args)
    {

        System.out.println("Midpoint Approximation: " + MidpointApprox.midpointApproximator());
        System.out.println("Trapezoidal Approximation: " + TrapezoidalApprox.trapezoidalApproximator());
        System.out.println("Simpson Approximation: " + SimpsonApprox.simpsonApproximator());
    }
}
