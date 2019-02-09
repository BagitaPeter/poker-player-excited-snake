package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        int bet = 0;
        JsonElement jelement = new JsonParser().parse(gameState);
        JsonObject  jobject = jelement.getAsJsonObject();
        jobject = jobject.getAsJsonObject("game_state");
        JsonArray jarray = jobject.getAsJsonArray("hole_cards");
        jobject = jarray.get(0).getAsJsonObject();
        String result = jobject.get("suits").getAsString();


        if(result=="hearts"){
            bet = 10;
        }return bet;
    }

    public static void showdown(JsonElement game) {

    }
}
