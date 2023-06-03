package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.example.GetCards.cards;

public class GameManager {

    public static void gameStart() throws IOException, ParseException {


      GetCards.drawCard(2);



        if(TranslateScore.translate(cards) == 21){System.out.println("----------YOU WIN----------");
        System.exit(0);}

    }






}
