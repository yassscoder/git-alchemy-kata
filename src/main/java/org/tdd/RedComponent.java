package org.tdd;

public class RedComponent implements Component {

    @Override
    public int power(int numberOfDrops, int seconds) {
        return Math.abs(Math.max(numberOfDrops,seconds)+1);
    }

}
