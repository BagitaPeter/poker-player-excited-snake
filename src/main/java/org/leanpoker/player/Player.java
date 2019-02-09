package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "testplayer2";

    public static int betRequest(JsonElement request) {
        int bet = 0;

        JsonObject  jobject = request.getAsJsonObject();
        jobject1 = jobject.getAsJsonObject("game_state");
        JsonArray jarray = jobject1.getAsJsonArray("players");
        jobject2 = jarray.get(1).getAsJsonObject();

        JsonArray jarray1 = jobject2.getAsJsonArray("hole_cards");
        jobject3 = jarray1.get(0).getAsJsonObject();

        String result = jobject3;


        if(result=="hearts"){
            bet = 23;
        }return bet;
    }

    public static void showdown(JsonElement game) {

    }
}


