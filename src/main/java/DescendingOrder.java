import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String numString = String.valueOf(num);
        int[] arrayNumString = new int[numString.length()];

        for (int i = 0; i < numString.length(); i++) {
            arrayNumString[i] = Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        Arrays.sort(arrayNumString);
        String result = "";
        for (int i = arrayNumString.length - 1; i >= 0; i--) {
            result += arrayNumString[i];
        }
        System.out.println(Integer.parseInt(result));
        return Integer.parseInt(result);
    }
}