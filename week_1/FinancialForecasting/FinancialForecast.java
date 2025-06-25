public class FinancialForecast {
    public static double forecastFutureValue(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return (1 + rate) * forecastFutureValue(initialValue, rate, years - 1);
    }

    public static void main(String[] args) {
        double initial = 1000.0;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = forecastFutureValue(initial, growthRate, years);
        System.out.printf("Future Value after %d years: $%.2f\n", years, futureValue);
    }
}
