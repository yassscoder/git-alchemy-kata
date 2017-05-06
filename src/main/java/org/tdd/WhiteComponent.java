package org.tdd;

/**
 * Created by jsrois on 4/5/17.
 */
public class WhiteComponent implements Component {
    private Component[] components;

    public WhiteComponent() {
        // TODO: complete this

    }

    @Override
    public int power(int numberOfDrops, int seconds) {
        // DO NOT MODIFY THIS CODE
        int partialResult = numberOfDrops;
        for (Component component:
             this.components) {
            partialResult = component.power(partialResult, seconds);
        }
        return partialResult;
    }
}
