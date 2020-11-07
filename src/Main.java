public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentForOneYear = service.calculate(1_000_000, 1);
        System.out.println(monthlyPaymentForOneYear);

        int monthlyPaymentForTwoYears = service.calculate(1_000_000, 2);
        System.out.println(monthlyPaymentForTwoYears);

        int monthlyPaymentForThreeYears = service.calculate(1_000_000, 3);
        System.out.println(monthlyPaymentForThreeYears);
    }
}
