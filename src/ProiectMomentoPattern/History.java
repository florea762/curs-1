package ProiectMomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<TableState>states = new ArrayList<>();

    public void push(TableState state) {
        states.add(state);
    }

    public TableState pop() {
        if (states.size() <= 1) {
            return null;
        } else {
            var lastIndex = states.size() - 1;
            var lastState = states.get(lastIndex);
            states.remove(lastState);
            return lastState;
        }
    }
}
