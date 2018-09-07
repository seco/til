package self.javaWebProgrammingSchool.basic;

import java.util.Collections;
import java.util.List;

public class Dealer {
    private String name;
    private List<Player> playList;
    private List<Card> cardList;
    private int index;

    public Dealer(String name) {
        this.name = name;
        this.index = 0;
    }

    public void setPlayList(List<Player> playList) {
        this.playList = playList;
    }

    public void setCards(List<Card> cardList) {
        this.cardList = cardList;
    }

    public void newGame() {
        index = 0;
        for(Player player : playList) {
            player.clear();
        }
    }
    public void mix() {
        Collections.shuffle(cardList);
    }
    public Card getCard(){
        Card card = cardList.get(index);
        index++;
        return card;
    }

    public void result(){
        for(Player player : playList) {
            System.out.println(player.getCards());
        }
    }
}
