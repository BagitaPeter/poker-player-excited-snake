package org.leanpoker.player;

import org.leanpoker.TableStat;

public class test {

    public static void main(String[] args) {
        TableStat tableStat = new TableStat();

        System.out.println("name: " + tableStat.getName());
        System.out.println("hand: " + tableStat.getHand());
        System.out.println("card on table: " + tableStat.getCardsOnTable());
        System.out.println("bet: " + tableStat.getBet());

    }
}
