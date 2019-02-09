package org.leanpoker;

import com.google.gson.JsonElement;

public class TableStat {

    private String name;
    private JsonElement hand;
    private String cardsOnTable;
    private JsonElement bet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonElement getHand() {
        return hand;
    }

    public void setHand(JsonElement hand) {
        this.hand = hand;
    }

    public String getCardsOnTable() {
        return cardsOnTable;
    }

    public void setCardsOnTable(String cardsOnTable) {
        this.cardsOnTable = cardsOnTable;
    }

    public JsonElement getBet() {
        return bet;
    }

    public void setBet(JsonElement bet) {
        this.bet = bet;
    }


}
