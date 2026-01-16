package ru.netology.tournament;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> playersList = new ArrayList<>();

    public void register (Player player){
       playersList.add(player);
    }

    public Player findByName(String name){
        for(Player player : playersList) {
            if (player.getName() == name) {
                return player;
            }
        }
        return null;
    }


    public int round (String playerName1, String playerName2){
        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);

        if (player1 == null) {
            throw new NotRegisteredException("Player " + playerName1 + " is not registered");
        }

        if (player2 == null) {
            throw new NotRegisteredException("Player " + playerName2 + " is not registered");
        }
        return player1.compareTo(player2);
        }
}
