package ru.netology.tournament;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {


    Player player1 = new Player(1, "Druid", 14);
    Player player2 = new Player(2, "Sorcerer", 10);
    Player player3 = new Player(3, "Fighter", 20);
    Player player4 = new Player(4, "Bard", 10);
    Player player5 = new Player(5, "Cleric", 15);

    @Test

    public void shouldFindByCorrectName() {

        Game game = new Game();

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        Player expected = player2;
        Player actual = game.findByName("Sorcerer");

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotFindByIncorrectName() {

        Game game = new Game();

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        Player expected = null;
        Player actual = game.findByName("Warlock");

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldCompareCorrectlyPlayer1() {

        Game game = new Game();

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        int expected = 1;
        int actual = game.round("Druid", "Fighter");
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldCompareCorrectlyPlayer2() {

        Game game = new Game();

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        int expected = 2;
        int actual = game.round("Druid", "Sorcerer");
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldCompareCorrectlyEqual() {

        Game game = new Game();

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        int expected = 0;
        int actual = game.round("Sorcerer", "Bard");
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldThrowException1() {

        Game game = new Game();

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Warlock", "Cleric");
        });

    }

    @Test

    public void shouldThrowException2() {

        Game game = new Game();

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Cleric", "Rogue");
        });

    }
}
