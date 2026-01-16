package ru.netology.tournament;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> playersList = new ArrayList<>();

    private void register (Player player){
       playersList.add(player);
    }

    private Player findByName(String name){
        for(Player player : playersList) {

        }
        return null;
    }


    public void round (String playerName1, String playerName2){
        if(!playersList.contains(playerName1)) {
            throw new NotRegisteredException("Player" + playerName1 + "is not registered");

            else if (!playersList.contains(playerName2)) {
                    throw new NotRegisteredException("Player" + playerName2 + "is not registered");
                }
                else {

                }

            }
        }
}
