/**
 *
 * 3. CalcFour. Упражнение «Калькулятор Четырех Операций»
 a)	Прочитать с консоли число 1
 b)	Прочитать с консоли число 2
 c)	Вывести сумму, разность, произведение и частное введенных чисел.


 * Created by romario on 2/25/2017.
 */

import java.util.Scanner;

public class CalcFour {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("input a: ");
        double a = s.nextDouble();
        System.out.print("input b: ");
        double b = s.nextDouble();
        System.out.printf("A+B=%f%n",a+b);
        System.out.printf("A-B=%f%n",a-b);
        System.out.printf("A*B=%f%n",a*b);
        System.out.printf("A/B=%f%n",a/b);

    }
}
