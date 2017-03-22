/**
 * Created by romario on 2/25/2017.
 * *Ввод переменных*
 1. RevInput. Вывести на экран три введенных с клавиатуры числа в порядке, обратном их вводу.

 */
import java.util.Scanner;

public class RevInput {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.printf("Input 1: ");
      int a1=s.nextInt();
      System.out.printf("%nInput 2: ");
      int a2=s.nextInt();
      System.out.printf("%nInput 3: ");
      int a3=s.nextInt();
      System.out.printf("Reverse: %d %d %d", a3,a2,a1);
    }
}
