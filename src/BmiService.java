public class BmiService {
    public double calculate(int weightInKilograms, double heightInMeters) {

        return (int) (weightInKilograms / (heightInMeters * heightInMeters));
    }
}