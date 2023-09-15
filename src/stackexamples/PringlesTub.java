package stackexamples;

import java.util.Stack;

public class PringlesTub {
    Stack<Pringles> chips = new Stack<>();

    public PringlesTub() {
        for (int i = 0; i <152; i++) {
            chips.push(new Pringles());
        }
    }

}
