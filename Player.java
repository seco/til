package self.javaWebProgrammingSchool;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cardList;

    public Player(String name) {
        this.name = name;
        this.cardList = new ArrayList<>();
    }

    public void clear(){
        cardList.clear();
    }

    public void addCard(Card card){
        this.cardList.add(card);
    }

    public List<Card> getCards(){
        return cardList;
    }
}
