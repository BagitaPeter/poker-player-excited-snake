package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.leanpoker.TableStat;

import java.util.Map;

public class Player {

    static final String VERSION = "DumbRobot1.1";

    public static int betRequest(JsonElement request) {

        TableStat tableStat = new TableStat();

        JsonObject jObject = request.getAsJsonObject();

        JsonElement cardsUsed = jObject.get("cards_used");
        JsonElement bet = jObject.get("bet");

        tableStat.setHand(cardsUsed);
        tableStat.setBet(bet);

        JsonArray jarray = jObject.getAsJsonArray("hole_cards");
        jObject = jarray.get(0).getAsJsonObject();

        String result = jObject.get("suit").getAsString();


        return 0;
    }

    public static void showdown(JsonElement game) {


    }
}
