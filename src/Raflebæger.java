import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raflebæger {
    private int numberOfDies;
    private ArrayList<Integer> results = new ArrayList<>();


    public Raflebæger (int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }

    public int shake() {

        int total = 0;
        Random random = new Random();
        for (int i = 0; i < numberOfDies; i++) {
            int result = random.nextInt(6) + 1;
            results.add(result);
            System.out.println(result);
            total += result;

        }
        return total;
    }
    public List<Integer> getResults() {
        return results;
    }

    public static void main(String[] args) {
        Raflebæger rb = new Raflebæger(4);
        System.out.println(rb.shake());
    }
}
