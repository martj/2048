package main;

public class GameLogic {
    // ako mestq na dqsno trugvam ot nai-dqsnata kletka, ako mestq na gore
    // trugvam ot nai-gornata kletka
    public void moveCell() {

    }

    public int sumNeighburCell(int a, int b) {
        return a + b;
    }

    public boolean checkIfCanBeSum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    // vzima indeksite na praznite kletki , vuvejda gi v masiv i s randome
    // chislo v range-a 0 do lenght na masiva vzimame index-a v koito da
    // printnem novata
    // "2"
    public void getEmptyCells(int[][] grid, final int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == 0) {

                }
        }
        }
    }

    // randome chislo ot 0 do 9 i proverka dali chisloto == 4
    // return T=4 else F=2
    public boolean setTwoOrFour() {
        return true;
    }

    public void newElement() {

    }
}
