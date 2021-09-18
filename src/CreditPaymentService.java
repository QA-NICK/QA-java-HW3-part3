public class CreditPaymentService {
    public int calculate(int term, float rate, int amount) {
        float monthRate = rate / 100 / 12;
        int payment = (int) (amount * (monthRate + (monthRate / (Math.pow((1 + monthRate), term) - 1))));
        return payment;
    }


}
