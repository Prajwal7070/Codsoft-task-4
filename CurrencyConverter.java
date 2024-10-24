import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("INR", 82.0);

        System.out.println("Available currencies: " + exchangeRates.keySet());

        System.out.print("Enter base currency (e.g., USD, EUR, GBP, INR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency (e.g., USD, EUR, GBP, INR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount in " + baseCurrency + ": ");
        double amount = scanner.nextDouble();

        if (exchangeRates.containsKey(baseCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double baseToUSD = exchangeRates.get(baseCurrency);
            double targetToUSD = exchangeRates.get(targetCurrency);
            double convertedAmount = (amount / baseToUSD) * targetToUSD;

            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Invalid currency selected.");
        }

        scanner.close();
    }
}
