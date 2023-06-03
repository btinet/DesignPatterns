package edu.inflk.patterns.helper;

import java.util.concurrent.ThreadLocalRandom;

public class IntegerHelper {

    public static int generateRandomInteger(int lowerBound, int upperBound)
    {
        return ThreadLocalRandom.current().nextInt(lowerBound, upperBound + 1);
    }

}
