import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {


    @Test
    public void GameTest() {

        Game game = new Game();

        int actual= game.round("Ira","Oleg");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }



@Test
    public void TestPound() {

    Player player = new Player(9,"Sasha", 150);
    Player player1 = new Player(5, "Ira",100);

    Game game = new Game();

    int actual = player.strength;
    int expected = 150;

    Assertions.assertEquals(expected,actual);
}
@Test
    public void testRegister() {
    Player player1 = new Player(32,"Roma", 200);
    Player player2 = new Player(5, "Ira",100);
    Player player3 = new Player(9,"Sasha", 150);


  Game game = new Game();

    ArrayList<Player> actual =game.register(player1,player2);
    ArrayList<Player> expected = new ArrayList<>();
    expected.add(player1);
    expected.add(player2);
   // expected.add(player3);

   Assertions.assertEquals(expected, actual);

}

@Test
    public void testGetName() {
    Player player1 = new Player(32,"Roma", 200);
    Player player2 = new Player(5, "Ira",300);
    Player player3 = new Player(9,"Sasha", 150);

    Game game = new Game();


    int actual = player2.getStrength();
    int expected = 300;

   Assertions.assertEquals(expected, actual);
}


    @Test
    public void testPlayers() {
        Player player1 = new Player(32,"Roma", 500);
        Player player2 = new Player(5, "Ira",300);
       // Player player3 = new Player(9,"Sasha", 150);

        Game game = new Game();
        Player playerName1 = player1;
        Player playerName2 = player2;

        String actual = playerName1.getName();
        String expected= "Roma";

        Assertions.assertEquals(expected, actual);











    }
}





