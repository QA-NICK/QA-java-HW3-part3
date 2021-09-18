public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int term;
        float rate = (float) 9.99;
        int amount = 1_000_000;
        double payment = service.calculate(12, rate, amount);
        System.out.format("%.0f " , payment );
        double payment1 = service.calculate(24, rate, amount);
        System.out.format("%.0f ", payment1);
        double payment2 = service.calculate(36, rate, amount);
        System.out.format("%.0f ", payment2);


    }
}