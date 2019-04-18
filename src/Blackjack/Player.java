package Blackjack;

public class Player {
    private Hand hand;
    private int totalBets;
    private int currentBets;
    private Deck deck;
    // 是否已经停止要牌牌了
    private boolean stopDealing;

    // 加入游戏
    public void joinGame(Deck deck) {

    }

    public void placeBets(int amount) {

    }

    // 添加一张牌
    public void insertCard(Card card){

    }

    public void dealNextCard(){
        // 由deck发牌给玩家
        Card nextCard = deck.dealNextCard();
        insertCard(nextCard);
    }

    // 不要牌了，停止游戏
    public void stopDealing(){

    }

    public void updateBets(int amount){

    }

    public int getCurrentBets(){
        return currentBets;
    }
}
