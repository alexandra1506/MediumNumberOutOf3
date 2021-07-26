import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws Exception {
        /*Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a == b) && (a == c)){
            System.out.println(c);
        } else if (((a >= b) && (b >= c))||((a <= b) && (b <= c))){
            System.out.println(b);
        }else if (((a >= c) && (c >= b)) ||((a <= c) && (c <= b))){
            System.out.println(c);
        }else if (((b >= a) && (a >= c)) ||((b <= a) && (a <= c))){
            System.out.println(a);
        }
    }
}

