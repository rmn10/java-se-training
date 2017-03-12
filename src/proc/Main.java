import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       for (;;) {


           int x = (int) (Math.random() * 3 + 1);
           System.out.println(x);
           System.out.print("Enter you answer : ");
           Scanner s = new Scanner(System.in);
           String answer = s.nextLine();
           if("exit".equals(answer)) {
               return;
           } else if(Integer.parseInt(answer) == x)  {
               System.out.println("CORRECT!!");
           } else {
               System.out.println("INCORRECT!!");
           }
       }
    }
}
