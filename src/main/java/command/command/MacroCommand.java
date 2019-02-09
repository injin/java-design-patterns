package command.command;

import java.util.Iterator;
import java.util.Stack;

// 복수의 명령을 모은 명령
public class MacroCommand implements Command {

    private Stack<Command> commands = new Stack<>();
    
    @Override
    public void execute() {
        Iterator<Command> ita = commands.iterator();
        while(ita.hasNext()) {
            ita.next().execute();
        }
    }
    
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    
    public void clear() {
        commands.clear();
    }

}
