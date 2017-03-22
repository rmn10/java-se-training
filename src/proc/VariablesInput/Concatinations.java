/**
 *
 2. Concatinations. Упражнение «Конкатенация строк»
 a)	Прочитать 3 строки в переменные s1, s2, s3
 b)	Вывести на экран 3 другие строки, а именно конкатенацию:
 1.	s1 + s3
 2.	s3 + s2 + s1
 3.	s1 + s2 + s3

 * Created by romario on 2/25/2017.
 */
import java.util.Scanner;

public class Concatinations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Input String_1: ");
        String s1 = s.next();
        System.out.printf("Input String_2: ");
        String s2 = s.next();
        System.out.printf("Input String_3: ");
        String s3 = s.next();
        System.out.println("S1+S3 : "+(s1+s3));
        System.out.println("S3+S2+S1 : "+(s3+s2+s1));
        System.out.println("S1+S2+S3 : "+(s1+s2+s3));

    }
}
