package org.tdd;

/**
 * Created by jsrois on 4/5/17.
 */
public class BlueComponent implements Component {
    @Override
    public int power(int numberOfDrops, int seconds) {
        // TODO: complete this
        int result = Math.abs(numberOfDrops- 2*seconds);
        return result;
    }
}
