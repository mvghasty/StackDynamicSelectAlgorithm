import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class DynamicSelect {
    public Object[] StackDynamicSelect(int position, Stack<String> stack) {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        int stackDimensioner = stack.size();
        String organizer;
        List<String>stackCase = new ArrayList<>();
        List<String> picker = new ArrayList<>();

        for (int i = -(stack.size()); i < stack.size(); i++) {
            organizer = stack.pop();
            stackCase.add(organizer);
        }

        for (int i = 0; i < stackCase.size(); i++) {
            if (i == position) {
                picker.add(stackCase.get(i));
            }
        }

        stackCase.remove(position);

        for (int i = -(stackDimensioner); i < stackCase.size() - 1; i++) {
            stack.push(stackCase.getLast());
            stackCase.removeLast();
        }

        Object[] item = picker.toArray();

        if (item.length == 0) {
            throw new EmptyStackException();
        }
        return picker.toArray();
    }
}