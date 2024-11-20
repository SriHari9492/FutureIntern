import java .util.*;
public class TicTacToe {
    static char[][] board = {
        {'1','2','3'},
        {'4','5','6'},
        {'7','8','9'}
    };
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain =true;
        while(playAgain) {
            resetBoard();
            char currentPlayer ='x';
            boolean gamewon =false;
            System.out.println("Welcome to the Game");
            printBoard();
            for(int turn =0; turn < 9 && !gamewon; turn++){
                System.out.println("Player" +currentPlayer + ", enter your move (1-9):");
                int move = sc.nextInt();
                if(!isValidMove(move)) {
                    System.out.println("Invalid move ! Try again.");
                    turn --;
                    continue;
                }
                placeMove(move,currentPlayer);
                printBoard();
                if(checkWinner(currentPlayer)) {
                    System.out.println("player " + currentPlayer+ "wins!");
                    gamewon = true;
                }
                currentPlayer =(currentPlayer == 'X') ? 'O' :'X';

            } 
            if(!gamewon) {
                System.out.println("it's a tie");
            }
            System.out.println("Do you wangt to continue (yes/no)");
            playAgain = sc.next().equalsIgnoreCase("Yes");
        }
        System.out.println("Thanks for playing");
        sc.close();
    }
    static void resetBoard() {
        char num = '1';
        for(int i =0; i< 3; i++){
            for(int j =0; j< 3; j++){
                board[i][j] = num++;
            }
        }
    }
    static void printBoard() {
        for(int i =0 ;i < 3;i++){
            for(int j =0; j< 3;j++){
                System.out.println(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
        static boolean  isValidMove (int move){
            if(move < 1 || move > 9) return false;
            int row =(move - 1)/3;
            int col = (move - 1)%3;
            return board[row][col] != 'X' && board[row][col] != 'O';
        }
        static void placeMove(int move ,char player) {
            int row =(move - 1) / 3;
            int col  =(move - 1) % 3;
            board[row][col] = player;
        }
        static boolean checkWinner(char player) {
            for(int i =0; i< 3;i++){
                if(board[i][0] == player && board[i][1]==player && board[i][2] == player) return true;
                  if(board[0][i] == player && board[1][i]==player && board[2][i] == player) return true;
            }
            return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board [1][1] == player && board [2][0] == player);
        }
    }