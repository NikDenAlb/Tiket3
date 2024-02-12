//Напишите код, с помощью которого можно разделить строку на части.
//
//Код должен работать для строк любого размера и любого содержания. Размер частей вы устанавливаете самостоятельно.
//                                                       String[]     f(String, int)

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] out = splitString("1234567890dshSDGERTG6575", 3);
        System.out.println(Arrays.toString(out));
    }

    public static String[] splitString(String s, int n) {
        String[] out;

        int steps = s.length() / n;
        if (s.length() % n != 0) {
            steps++;
        }
        out = new String[steps];

        for (int i = 0; i < s.length() / n; ) {
            out[i] = s.substring(i * n, ++i * n);
        }

        if (s.length() % n != 0) {
            out[steps - 1] = s.substring((steps - 1) * n);
        }
        return out;
    }
}