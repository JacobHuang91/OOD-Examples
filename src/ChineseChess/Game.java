package ChineseChess;

/**
 * 棋牌大厅中的一局游戏
 */
public class Game {
    private Player redPlayer;
    private Player blackPlayer;
    private Player currentPlayer;
    // 棋子
    // 由棋子组成的棋盘
    private Piece[][] board;
    private int steps;

    // 加入当前游戏
    public void joinGame(Player player){

    }

    // 初始化棋盘
    public void initializeBoard(){

    }

    public boolean move(Piece piece, int row, int col){
        return true;
    }

    // 由游戏内部自己调用
    private void changePlayer(){

    }

    private boolean ifCurrentPlayerWin(){
        return false;
    }

    // draw平均
    // 根据steps判断是不是平局了
    private boolean gameDraw(){
        return false;
    }

    // 如果当前玩家胜利了，那就得到积分
    private void rewardCurrentPlayer(){

    }
}
