package Blackjack;

import java.util.List;

/**
 * 一个牌桌
 */
public class Deck {
    private Dealer dealer;
    private List<Player> players;
    private List<Card> cards;

    // 加入一个玩家
    public void addPlayer(Player player) {

    }

    // 洗牌
    public void shuffle() {

    }

    // 初始发牌
    public void dealInitialCards(Player player) {

    }

    // 发牌给玩家或者庄家
    public Card dealNextCard() {
        return null;
    }

    // 比较玩家和庄家的牌
    // 进行结算
    public void compareResults() {
        for (Player player : players) {
            int currentBets = player.getCurrentBets();
            if (dealer.largeThan(player)) {
                dealer.updateBets(currentBets);
                player.updateBets(-currentBets);
            } else {
                dealer.updateBets(-currentBets);
                player.updateBets(currentBets);
            }
        }
    }
}
