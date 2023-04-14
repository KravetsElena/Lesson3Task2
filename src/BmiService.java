public class BmiService {
    public double calculate(double heightMetre, double weightKg) {
        double index;
        index = weightKg / (heightMetre * heightMetre);
        int bmiIndex = (int) index;
        return bmiIndex;

    }
}
