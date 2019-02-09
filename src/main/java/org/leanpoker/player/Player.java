package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "PlayerName";

    public static int betRequest(JsonElement request) {
        int bet = 0;

        JsonObject  jobject = request.getAsJsonObject();
        jobject = jobject.getAsJsonObject("game_state");
        JsonArray jarray = jobject.getAsJsonArray("hole_cards");
        jobject = jarray.get(0).getAsJsonObject();
        String result = jobject.get("suit").getAsString();


        if(result=="hearts"){
            bet = 11;
        }return bet;
    }

    public static void showdown(JsonElement game) {

    }
}
