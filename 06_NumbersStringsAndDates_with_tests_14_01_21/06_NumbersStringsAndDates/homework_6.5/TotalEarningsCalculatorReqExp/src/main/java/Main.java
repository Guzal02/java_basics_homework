import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateSalarySum("Вы не использовали регулярные выражения"));
    }

    public static int calculateSalarySum(String text) {
        //TODO: реализуйте метод

        int sum = 0;
        if (text.matches(".*\\d+.*")) {
            String[] numText = text.replaceAll("[^,0-9]", "").split(",\\s*");
            int[] arrSum = new int[numText.length];

            for (int i = 0; i < numText.length; i++) {
                arrSum[i] = Integer.parseInt(numText[i]);
                sum += arrSum[i];
            }
        }
        return sum;
    }
}