import java.util.ArrayList;

public class Game {

    protected ArrayList<Player> players = new ArrayList<>();


    public ArrayList<Player> register(Player player, Player player1) {
        players.add(player);
        players.add(player1);


        return players;
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = new Player(32,"Roma", 500); ;
        Player player2 = new Player(5, "Ira",300);;

        
        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
            if (player1 == null) {
                throw new RuntimeException("игрок" + playerName1 + "не зарегестрирован");
            }
            if (player2 == null) {
                throw new RuntimeException("игрок" + playerName2 + "не зарегестрирован");
            }
            if (player1.getStrength() == player2.getStrength()) {
                return 0;
            }
            if (player1.getStrength() > player2.getStrength()) {
                return 1;
            } else {
                return 2;

            }

        }


        return 0;
    }



}

