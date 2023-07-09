package tic_tak_too;

public class board {
    private char[][] board = new char[3][3];

    //initial value ......................
    public board() {
        char x = '1';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = x;
                x++;
            }

        }

    }
    //display the board..................
    protected void display(){
        for (int j=0;j<board.length;j++) {
            for (int i = 0; i < board.length; i++) {

                System.out.print(board[j][i]);
                if(i<2){
                    System.out.print(" | ");
                }
            }
            if(j<2){
                System.out.println("\n---------");}
        }
    }
    //x player value setter
    public void Setvalue_X(int x){


    }
//y player value setter
    public void Setvalue_Y(int x){

    }

}