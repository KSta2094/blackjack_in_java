package org.example;

import org.example.Configs.config;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GetCards {

    public static   List<String> cards = new LinkedList<>();
    public static JSONObject drawCard(int num) throws IOException, ParseException {

        JSONObject json = new SendReqest().sendReqest(new URL("https://www.deckofcardsapi.com/api/deck/"+ config.deck_id+"/draw/?count="+num));

        JSONArray TEST = (JSONArray) json.get("cards");




        for (Iterator<JSONObject> iterator = TEST.iterator(); iterator.hasNext(); ) {
            JSONObject rate = iterator.next();
            cards.add((String) rate.get("value"));
        }


        System.out.println("\f");
        System.out.println("Your hand : ");
        for (String card:cards
        ) {
            System.out.println(card);
        }

        return  json;
    }





}
