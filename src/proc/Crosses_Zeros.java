import java.io.IOException;
import java.util.Scanner;

public class Crosses_Zeros {
    public static void main(String[] args) throws IOException {
        int[][] matrix = new int[3][3];
        int counter = 0;
        int mode = 0;
        Scanner position = new Scanner(System.in);
        Scanner mod = new Scanner(System.in);
        System.out.println("Press 1 if you want play VERSUS computer");
        mode = mod.nextInt();

        for (int i = 0; i <= 8; i++) {

            if (counter == 0) {
                System.out.println("Enter position player 1");
                String[] poss = position.nextLine().split(" ");
                matrix[Integer.parseInt(poss[0]) - 1][Integer.parseInt(poss[1]) - 1] = 1;
                counter++;
            }
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[k][j] + " ");
                }
                System.out.println();
            }
            if(check(matrix) == 0) break;
            if (counter == 1 && mode != 1) {
                System.out.println("Enter position player 2");
                String[] poss = position.nextLine().split(" ");
                matrix[Integer.parseInt(poss[0]) - 1][Integer.parseInt(poss[1]) - 1] = 2;
                counter--;
            }else{
                int k = 0, j = 0;
                System.out.print("COMPUTER MOVE: ");
                do {
                    k = (int) (Math.random()*3);
                    j = (int) (Math.random()*3);
                }while (matrix[k][j] !=0);
                System.out.println(k + " " + j);
                matrix[k][j] = 2;
                counter--;
            }
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[k][j] + " ");
                }
                System.out.println();
            }
            if(check(matrix) == 0) break;
        }


    }

    public static int check(int[][] a) {

        if (a[0][0] == a[1][1] && a[2][2] == a[1][1]) {
            if (a[0][0] == 1 && a[0][0] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[0][0] == 2 && a[0][0] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        if (a[0][2] == a[1][1] && a[2][0] == a[1][1]) {
            if (a[0][2] == 1 && a[1][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[0][2] == 2 && a[1][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        if (a[0][0] == a[1][0] && a[2][0] == a[1][0]) {
            if (a[0][0] == 1 && a[1][0] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[0][0] == 2 && a[1][0] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        if (a[0][1] == a[1][1] && a[2][1] == a[1][1]) {
            if (a[0][1] == 1 && a[1][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[0][1] == 2 && a[1][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        if (a[0][2] == a[1][2] && a[2][2] == a[1][2]) {
            if (a[0][2] == 1 && a[1][2] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[0][2] == 2 && a[1][2] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        if (a[0][0] == a[0][1] && a[0][2] == a[0][1]) {
            if (a[0][2] == 1 && a[0][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[0][2] == 2 && a[0][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        if (a[1][0] == a[1][1] && a[1][2] == a[1][1]) {
            if (a[1][2] == 1 && a[1][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[1][2] == 2 && a[1][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        if (a[2][0] == a[2][1] && a[2][2] == a[2][1]) {
            if (a[2][2] == 1 && a[2][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            } else if (a[2][2] == 2 && a[2][1] != 0) {
                System.out.println(" CONGRATS PLAYER 1!! YOU WIN!!");
                return 0;
            }

        }
        return 1;
    }
}


