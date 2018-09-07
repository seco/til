package self.javaWebProgrammingSchool.basic;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    public static void main(String[] args){
        List<Card> cards = CardFactory.create();

        Dealer dealer = new Dealer("고니");
        dealer.setCards(cards);

        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player("홍길동"));
        playerList.add(new Player("고길동"));
        playerList.add(new Player("강길동"));

        dealer.setPlayList(playerList);

        dealer.newGame();
        dealer.mix();

        for(int i = 0; i < 5; i++) {
            for(Player player : playerList) {
                player.addCard(dealer.getCard());
            }
        }

        dealer.result();
    }

    public static class LottoBalls {
        private int number;

        //공이 절대로 변하지 않는다.
        public LottoBalls(int number) {
            this.number = number;
        }

        //공을 보낸다.
        public int getNumber() {
            return number;
        }

    }
}
