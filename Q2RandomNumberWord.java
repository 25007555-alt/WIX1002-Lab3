import java.util.Random;

public class Q2RandomNumberWord {
    public static void main(String[] args) {
        String[] words = {"zero", "one", "two", "three", "four", "five"};
        Random random = new Random();

        int number = random.nextInt(6); // Generates 0, 1, 2, 3, 4, or 5.
        System.out.println(number + " is " + words[number] + ".");
    }
}
