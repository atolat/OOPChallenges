package com.arpan;

public class Main {

    public static void main(String[] args) {


        int posP1=calculateHighScorePosition(1500);
        displayHighScorePosition("Armando",posP1);


        int posP2=calculateHighScorePosition(900);
        displayHighScorePosition("Julia",posP2);


        int posP3=calculateHighScorePosition(400);
        displayHighScorePosition("Edward",posP3);


        int posP4=calculateHighScorePosition(50);
        displayHighScorePosition("Timothy",posP4);







    }
    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName+" managed to get into position "+position+" on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore)
    {
        if(playerScore>1000)
            return 1;
        else if((playerScore>500) && (playerScore<1000))
            return 2;
        else if((playerScore>100)&&(playerScore<500))
            return 3;
        else
            return 4;

    }
}
