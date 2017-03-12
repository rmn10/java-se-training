public class Args {


        public static void main(String[] args) {

            //...

            //args = new String[2];
            //args[0] ="sdf";
            //args[1] = "fdsf";
            printArgs(args); // FIXED, DO NOT TOUCh THIS LINE!!!

        }



        private static void printArgs(String[] args) {

            System.out.print(args[1] + ", ");

            System.out.print(args[0]);

        }

    }

