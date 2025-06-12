import java.util.HashMap;
import java.util.Scanner;

public class currencyconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("INR", 1.0);
        exchangeRates.put("USD", 83.0);  // 1 USD = 83 INR
        exchangeRates.put("EUR", 90.0);  // 1 EUR = 90 INR

        System.out.println("Available currencies: INR, USD, EUR");

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("From currency: ");
        String from = scanner.next().toUpperCase();

        System.out.print("To currency: ");
        String to = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(from) || !exchangeRates.containsKey(to)) {
            System.out.println("Invalid currency!");
        } else {
            double inINR = amount * exchangeRates.get(from);
            double converted = inINR / exchangeRates.get(to);
            System.out.printf("Converted Amount: %.2f %s\n", converted, to);
        }

        scanner.close();
    }
}
