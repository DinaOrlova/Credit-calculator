public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm) {
        double annualInterestRate = 9.99;
        double numberOfMonth = creditTerm * 12;
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double additionalExpression = 1 + monthlyInterestRate;
        double pow = Math.pow(additionalExpression, numberOfMonth);
        double numerator = monthlyInterestRate * pow;
        double denominator = pow - 1;
        double monthlyPayment = creditAmount * numerator / denominator;
        return (int) monthlyPayment;
    }
}
