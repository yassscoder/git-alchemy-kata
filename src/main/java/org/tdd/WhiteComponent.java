package org.tdd;

/**
 * Created by jsrois on 4/5/17.
 */
public class WhiteComponent implements Component {
    private Component[] components;

    public WhiteComponent() {
        components = new Component[3];
        components[0] = new BlueComponent();
        components[1] = new GreenComponent();
        components[2] = new RedComponent();
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
