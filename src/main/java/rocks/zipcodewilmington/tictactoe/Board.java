package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;
    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX() {
        // Check Vertical
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (j == 2){
                    return true;
                }
                if (board[j][i] == 'X' && board[j+1][i] == 'X'){
                    continue;
                }
                else {
                    break;
                }
            }
        }

        // Check Horizontal
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (j == 2){
                    return true;
                }
                if (board[i][j] == 'X' && board[i][j+1] == 'X'){
                    continue;
                }
                else {
                    break;
                }
            }
        }

        // Check Diagonal
        if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
                (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X')){
            return true;
        }
        return false;

    }

    public Boolean isInFavorOfO() {
        // Check Vertical
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (j == 2){
                    return true;
                }
                if (board[j][i] == 'O' && board[j+1][i] == 'O'){
                    continue;
                }
                else {
                    break;
                }
            }
        }

        // Check Horizontal
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (j == 2){
                    return true;
                }
                if (board[i][j] == 'O' && board[i][j+1] == 'O'){
                    continue;
                }
                else {
                    break;
                }
            }
        }

        // Check Diagonal
        if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
                (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if ((isInFavorOfO() == true && isInFavorOfX() == true) || (isInFavorOfO() == false && isInFavorOfX() == false)){
            return true;
        }
        else {
            return false;
        }
    }

    public String getWinner() {

        if (isInFavorOfX() == true) {
            return "X";
        }

        if (isInFavorOfO() == true) {
            return "O";
        }
        return "";
    }

}
