package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board; // external to all methods with Board class so can be called by all methods within board class

    public Board(Character[][] matrix) {
        board = matrix; // ditto to comment on line 7
    }

    // multi-dimensional arrays: https://www.geeksforgeeks.org/multidimensional-arrays-in-java/
    public Boolean isInFavorOfX() {
        Character winningChar = 'X';
        int winner = 0;
        if (board[0][0] == winningChar && board[0][1] == winningChar && board[0][2] == winningChar) { // all characters in top row
            winner = 1;
        } else if (board[1][0] == winningChar && board[1][1] == winningChar && board[1][2] == winningChar) {
            winner = 1;
        } else if (board[2][0] == winningChar && board[2][1] == winningChar && board[2][2] == winningChar) {
            winner = 1;
        } else if (board[0][0] == winningChar && board[1][0] == winningChar && board[2][0] == winningChar) {
            winner = 1;
        } else if (board[0][1] == winningChar && board[1][1] == winningChar && board[2][1] == winningChar) {
            winner = 1;
        } else if (board[0][2] == winningChar && board[1][2] == winningChar && board[2][2] == winningChar) {
            winner = 1;
        } else if (board[0][0] == winningChar && board[1][1] == winningChar && board[2][2] == winningChar) {
            winner = 1;
        } else if (board[0][2] == winningChar && board[1][1] == winningChar && board[2][0] == winningChar) {
            winner = 1;
        }
        return (winner == 1);
    }

    public Boolean isInFavorOfO() {
        Character winningChar = 'O';
        int winner = 0;
        if (board[0][0] == winningChar && board[0][1] == winningChar && board[0][2] == winningChar) { // all characters in top row
            winner = 1;
        } else if (board[1][0] == winningChar && board[1][1] == winningChar && board[1][2] == winningChar) {
            winner = 1;
        } else if (board[2][0] == winningChar && board[2][1] == winningChar && board[2][2] == winningChar) {
            winner = 1;
        } else if (board[0][0] == winningChar && board[1][0] == winningChar && board[2][0] == winningChar) {
            winner = 1;
        } else if (board[0][1] == winningChar && board[1][1] == winningChar && board[2][1] == winningChar) {
            winner = 1;
        } else if (board[0][2] == winningChar && board[1][2] == winningChar && board[2][2] == winningChar) {
            winner = 1;
        } else if (board[0][0] == winningChar && board[1][1] == winningChar && board[2][2] == winningChar) {
            winner = 1;
        } else if (board[0][2] == winningChar && board[1][1] == winningChar && board[2][0] == winningChar) {
            winner = 1;
        }
        return (winner == 1);
    }

    public Boolean isTie() {
        int isTie = 0;
        if (isInFavorOfX()) {
            isTie = 1;
        } else if (isInFavorOfO()) {
            isTie = 1;
        }
        // if infavor of x = true, +1
        // else if infavor of o = true, +1
        // else do nothing
        return isTie == 0;
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        } else if (isInFavorOfO()) {
            return "O";
        } else {
            return "";
        }
    }
}
