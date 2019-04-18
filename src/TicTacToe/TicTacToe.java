package TicTacToe;

public class TicTacToe {
    // 棋盘
    private Board board;
    // 当前玩家是哪个 X或者O
    private char currentMove;

    public void makeMove(int row, int col){
        board.makeMove(row, col, currentMove);
        if (board.checkWin()){
            System.out.println(currentMove + " win");
        } else if (board.isBoardFull()){
            // 平局
            System.out.println("it is a tie");
        }

        changePlayer();
    }

    private void changePlayer(){

    }
}
