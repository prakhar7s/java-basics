import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatedFromString {
    public static void main(String[] args) {
        String str = "AAAAAAaaaaaa";

        // method 1
        System.out.println(bruteForceMethod(str));
    }

    public static String bruteForceMethod(String s) {
        int index = 0;
        char str[] = s.toCharArray();
        int n = str.length;

        for (int i = 0; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            if (i == j) {
                str[index++] = str[i];
            }
        }

        return String.valueOf(Arrays.copyOf(str, index));
    }

}
