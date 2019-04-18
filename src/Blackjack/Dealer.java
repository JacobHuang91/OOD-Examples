package Blackjack;

public class Dealer {
    private Hand hand;
    private Deck deck;
    private int bets;

    // 添加一张牌
    public void insertCard(Card card){

    }

    public void dealNextCard(){
        Card nextCard = deck.dealNextCard();
        insertCard(nextCard);
    }

    // 由庄家进行结算
    public boolean largeThan(Player player){
        return true;
    }

    public void updateBets(int amount){

    }
}
