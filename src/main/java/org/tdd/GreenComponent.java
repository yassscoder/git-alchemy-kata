package org.tdd;

/**
 * Created by jsrois on 4/5/17.
 */
public class GreenComponent implements Component{
    @Override
    public int power(int numberOfDrops, int seconds) {
        return Math.abs(numberOfDrops*numberOfDrops-seconds);
    }
}
