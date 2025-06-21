package finance;

public class FinancialForecast {

    public static double futureValueRecursive(double presentValue, double rate, int periods) {
        if(periods == 0) return presentValue; 
        return (1+rate)*futureValueRecursive(presentValue, rate, periods-1); 
    }

    public static double futureValueIterative(double presentValue, double rate, int periods) {
        double result = presentValue;
        for(int i=0; i<periods; i++) 
         result *= (1+rate);
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;   // Initial investment
        double growthRate = 0.05;        // 5% annual growth
        int years = 10;                  // Forecast for 10 years

        double futureValueRec = futureValueRecursive(presentValue, growthRate, years);

        double futureValueIter = futureValueIterative(presentValue, growthRate, years);

        System.out.printf("=== Financial Forecasting ===\n");
        System.out.printf("Initial Investment: Rs%.2f\n", presentValue);
        System.out.printf("Annual Growth Rate: %.2f%%\n", growthRate*100);
        System.out.printf("Years: %d\n\n", years);

        System.out.printf("Future Value (Recursive): Rs%.2f\n", futureValueRec);
        System.out.printf("Future Value (Iterative): Rs%.2f\n", futureValueIter);
    }
}
