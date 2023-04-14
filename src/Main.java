public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetre = 1.87;
        double weightKg = 98;

        double bmiIndex = service.calculate(heightMetre, weightKg);
        System.out.println("bmi-индекс:" + bmiIndex);
    }

}