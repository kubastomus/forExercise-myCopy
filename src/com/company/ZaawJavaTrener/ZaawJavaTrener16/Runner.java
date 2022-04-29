package com.company.ZaawJavaTrener.ZaawJavaTrener16;

import java.util.Arrays;

public enum Runner {

    BEGINNER(120, 240),
    INTERMEDIATE(60, 100),
    ADVANCED(30, 50);

    private int minTimeR;
    private int maxTimeR;

    Runner(int nimTimeR, int maxTimeR) {
        this.minTimeR = nimTimeR;
        this.maxTimeR = maxTimeR;
    }

    public int getMinTimeR() {
        return minTimeR;
    }

    public void setMinTimeR(int minTimeR) {
        this.minTimeR = minTimeR;
    }

    public int getMaxTimeR() {
        return maxTimeR;
    }

    public void setMaxTimeR(int maxTimeR) {
        this.maxTimeR = maxTimeR;
    }

    public static Runner getFitnessLevel(int time){
//        if (BEGINNER.minTimeR < time && time < BEGINNER.maxTimeR)
//            return BEGINNER;
//        else if (INTERMEDIATE.minTimeR < time && time < INTERMEDIATE.maxTimeR)
//            return INTERMEDIATE;
//        else if (ADVANCED.minTimeR < time && time < ADVANCED.maxTimeR)
//            return ADVANCED;
//        return null;

        return Arrays.stream(Runner.values())
                .filter(runner -> time > runner.minTimeR && time <= runner.maxTimeR)
                .findFirst().get();
    }
}
