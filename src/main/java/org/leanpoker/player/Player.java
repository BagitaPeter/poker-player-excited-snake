package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Map;

public class Player {

    static final String VERSION = "DumbRobot1.1";

    public static int betRequest(JsonElement request) {
        int bet = 0;
        JsonObject jobject = request.getAsJsonObject();
        jobject = jobject.getAsJsonObject("game_state");
        JsonArray jarray = jobject.getAsJsonArray("hole_cards");
        jobject = jarray.get(0).getAsJsonObject();
        String result = jobject.get("suit").getAsString();


        if(result=="hearts"){
            bet = 10;
        }return bet;
    }

    public static void showdown(JsonElement game) {
    }
}
