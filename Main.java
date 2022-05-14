import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int testAmount = scanner.nextInt();
        
        if (testAmount < 1 || testAmount > 10)
            return;

        for (int i = 0; i < testAmount; i++) {
            int people = scanner.nextInt();

            int[] words = new int[people];

            for (int j = 0; j < people; j++) {
                words[j] = scanner.nextInt();
            }

            int count = 0;

            for (int j = 0; j < words.length; j++) {
                int actual = words[j];
                int before = j ==0?actual:words[j-1];
                int next = j+1 >= words.length ? actual : words[j+1];

                if(actual != before  || actual != next)
                    count++;
            }

            System.out.println(count);
        }
    }
}
