package my.examples;

import java.util.List;

public class Game {
    private List<Player> list;

    public Game() {
        System.out.println("Game()");
    }

    public void setPlayerList(List<Player> list) {
        System.out.println("Game.setPlayerList()");
        this.list = list;
    }

    public void play() {
        System.out.println("Game.play()");
        for(Player player : list) {
            player.play();
        }
    }
}
