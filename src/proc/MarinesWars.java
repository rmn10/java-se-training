

import java.util.Scanner;

public class MarinesWars {
    static char[][] battle_place_human = new char[10][10];
    static char[][] battle_place_computer = new char[10][10];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // fill matrix zeros
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battle_place_human[i][j] = '0';
                battle_place_computer[i][j] = '0';
            }
        }
        // input PLAYER ships
        String ships;
        System.out.println("Enter coordinates ONE 4 decks ship(like 1 1,1 2,1 3,1 4):");
        ships = s.nextLine();
        place_ships(ships);
        System.out.println("Enter coordinates TWO 3 decks ship(like 1 1,1 2,1 3;3 1,3 2,3 3):");
        ships = s.nextLine();
        place_ships(ships);
        System.out.println("Enter coordinates THREE 2 decks ship(like 1 1, 1 2; 3 1, 3 2; 3 3):");
        ships = s.nextLine();
        place_ships(ships);
        System.out.println("Enter coordinates FOUR 1 deck ship(like 1 1; 3 3; 7 5; 3 6):");
        ships = s.nextLine();
        place_ships(ships);

    }    // place ships in matrix

    public static void place_ships(String shipss) {
        String[] ships;
        try {
            ships = shipss.split(";");
        } catch (Exception e) {
            ships = new String[1];
            ships[0] = shipss;
        }
        if (ships.length != 0) {
            for (String ship : ships) {
                String[] coords = ship.split(",");
                for (int j = 0; j < coords.length; j++) {
                    String[] x_y = coords[j].split(" ");
                    battle_place_human[Integer.parseInt(x_y[0]) - 1][Integer.parseInt(x_y[1]) - 1] = '1';
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(battle_place_human[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void computer_place_ships(int size) {

        boolean n_poss = false;

        while (n_poss) {
            int is_horis = (int) (Math.random() * 2);
            int x_random = random_coords();
            int y_random = random_coords();

            if (is_horis == 1 && (x_random < (10 - size))) {
                for (int i = x_random; i < x_random + size; i++) {
                    if (battle_place_computer[y_random][i] == 1) {
                        n_poss = false;
                    }
                }
            }

            for (int i = 4; i >= 1; i++) {

            }
        }

    }

    public static void computer_place(int size, int x, int y, boolean vertical, char a) {

        if (vertical) {
            for (int i = 0; i <= size; i++) {
                battle_place_computer[x+i][y] = '1';
                battle_place_computer[x+i][y+1] = '2';
                battle_place_computer[x+i][y-1] = '2';
            }
            if(y>0) {
                //upper border
                battle_place_computer[x - 1][y - 1] = '2';
                battle_place_computer[x - 1][y] = '2';
                battle_place_computer[x - 1][y + 1] = '2';
            }
            if(y<9) {
                //lower border
                battle_place_computer[x + size][y - 1] = '2';
                battle_place_computer[x + size][y] = '2';
                battle_place_computer[x + size][y + 1] = '2';
            }
        }else {
            for (int i = 0; i <= size; i++) {
                battle_place_computer[x][y+i] = '1';
                battle_place_computer[x+1][y+i] = '2';
                battle_place_computer[x-1][y+i] = '2';
            }
            if(x>0) {
                //left border
                battle_place_computer[x - 1][y - 1] = '2';
                battle_place_computer[x][y - 1] = '2';
                battle_place_computer[x + 1][y - 1] = '2';
            }
            if(x<9) {
                //right border
                battle_place_computer[x - 1][y + size] = '2';
                battle_place_computer[x][y + size] = '2';
                battle_place_computer[x + 1][y + size] = '2';
            }
        }
    }



    public static int random_coords() {
        return (int) (Math.random() * 11);
    }
}


