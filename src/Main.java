public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentForOneYear = service.calculate(1_000_000.0, 1.0);
        System.out.println(monthlyPaymentForOneYear);

        int monthlyPaymentForTwoYears = service.calculate(1_000_000.0, 2.0);
        System.out.println(monthlyPaymentForTwoYears);

        int monthlyPaymentForThreeYears = service.calculate(1_000_000.0, 3.0);
        System.out.println(monthlyPaymentForThreeYears);
    }
}
