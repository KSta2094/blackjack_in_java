package org.example;

import java.util.List;

public class TranslateScore {


    public static int translate(List<String> cards) {

        int score = 0;

        for (String card : cards) {
           switch (card){

               case "JACK":
                   score+=10;
                   break;
               case "KING":
                   score+=10;
                   break;
               case "QUEEN":
                   score+=10;
                   break;
               case "ACE":
                   score+=11;
                   break;
               default:
                   score+= Integer.parseInt(card);
           }
        }

return score;
    }}
