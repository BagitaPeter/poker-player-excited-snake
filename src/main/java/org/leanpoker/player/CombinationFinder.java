package org.leanpoker.player;

public class CombinationFinder {
    public int myCombination(String[] mine, String[] community) {
        if (mine[1] == mine[3]) {
            int sameCards = 2;
            for (int i = 1; i < community.length + 1; i += 2) {
                if (community[i] == mine[1]) {
                    sameCards++;
                }
            }
            if (sameCards == 4) {
                return 7;
            }
        } else {
            int sameCards = 1;
            for (int i = 1; i < mine.length + 1; i += 2) {
                for (int j = 1; j < community.length + 1; j += 2) {
                    if (mine[i] == community[j]) {
                        sameCards++;
                    }
                }
                if(sameCards == 4){
                    return 7;
                }
                sameCards = 1;
            }
        }
    }

    public int howManySame()

}
