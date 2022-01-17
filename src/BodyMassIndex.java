public class BodyMassIndex {

    private double height;
    private double weight;

    public BodyMassIndex (double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public double calculate() {
        return weight / Math.pow(height, 2);
    }
    public boolean isUnderWeight() {
        return calculate() < 18.5;
    }
    public boolean isNormalWeight() {
        return calculate() >= 18.5 && calculate() <= 25;
    }
    public boolean isOverWeight() {
        return calculate() > 25;
    }

    public static void main(String[] args) {
        BodyMassIndex bmi = new BodyMassIndex(1.73, 150 );
        System.out.println(bmi.calculate());
        System.out.println("Is normal: " + bmi.isNormalWeight());
        System.out.println("Is under: " + bmi.isUnderWeight());
        System.out.println("Is over: " + bmi.isOverWeight());
    }
}
