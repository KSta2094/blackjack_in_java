package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class SendReqest {

   public JSONObject sendReqest(URL url) throws IOException, ParseException {


       HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
       connection.setRequestMethod("GET");
       connection.connect();


       JSONArray array = null;
       JSONObject jsonObject = null;
       Object object = null;
       if (connection.getResponseCode() != 200) {
           System.out.println("Error: " + connection.getResponseCode());
       } else {

           Scanner scanner = new Scanner(url.openStream());

           StringBuilder cards = new StringBuilder();
           while (scanner.hasNext()) {
               cards.append(scanner.nextLine());
           }

           JSONParser jsonParser = new JSONParser();

           object = jsonParser.parse(String.valueOf(cards));



           scanner.close();
       }


       return (JSONObject) object;


   }}
