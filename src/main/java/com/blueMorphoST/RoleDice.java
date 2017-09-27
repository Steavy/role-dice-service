package com.blueMorphoST;

import java.util.List;

public class RoleDice {
    private final int TheOracleSays;

    public RoleDice(List<Integer> dices) {
        int total = 0;
        for (int i = 0; i < dices.size(); i++) {
            total = total + getResultPerDice(dices.get(i));
        }
        this.TheOracleSays = total;
    }

    public int getTheOracleSays() {
        return TheOracleSays;
    }

    public int getResultPerDice(int dice) {
        int result;
        switch (dice) {
            case 3:
                result = 2;
                break;
            case 5:
                result = 4;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}