import java.sql.SQLOutput;
import java.util.Scanner;

public class NQueens {
    //safe function
public static Boolean issafe(char board[][] , int row ,  int col){
    // vertical up
    for (int i = row-1;  i>=0 ; i--){
        if (board[i][col] == 'Q'){
            return false;
        }
    }

    // digonal left up
    for ( int i=row-1 , j=col-1; i>=0 && j>=0; i-- , j-- ){
        if (board[i][j] == 'Q'){
            return false;
        }
    }

    // digonal right up
    for (int i = row-1 , j=col+1 ; i>=0 && j< board.length; i-- , j++){
        if (board[i][j] == 'Q'){
            return false;
        }
    }
    return true;
}
    // print function
    public static void printboard(char board[][]){
        System.out.println("**-------------chess board------------**");
        for (int i = 0; i< board.length; i++ ){
            for (int j = 0; j< board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

// nQueens posibility function
    public static void nQueens(char board[][], int row){
        //base
        if (row == board.length){
//            printboard(board);
            count++;
            return;
        }
        // column
        for(int j =0; j< board.length; j++){
            if (issafe(board , row , j)){
                board[row][j] = 'Q';
                nQueens(board ,row+1); // function call
                board[row][j] = 'X'; // backtracking step
            }

        }
    }

static int count = 0;
    // main function
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter number of N");
        int n = sc.nextInt();
        char board[][] =  new char[n][n];

        for (int i= 0; i<n; i++){
            for (int j =0; j<n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board , 0 );
        System.out.println("total ways to solve n queens " + count);
    }
}

///n Queens Time complexity
/// O(n!)
