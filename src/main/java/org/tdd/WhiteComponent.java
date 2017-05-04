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
    public int process(int leftOperand, int rightOperand) {
        int partialResult = leftOperand;
        for (Component component:
             this.components) {
            partialResult = component.process(partialResult, rightOperand);
        }
        return partialResult;
    }
}
