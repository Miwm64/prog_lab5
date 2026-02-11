import java.util.HashMap;
import java.util.Map;

public class HelpCommand implements Command {
    private String name;
    private Map<String, Command> commands;
    HelpCommand(String name, Map<String, Command> commands) {
        this.name = name;
        this.commands = commands;
    }
    @Override
    public void execute() {
        System.out.println("Help Command: " + name);
        commands.put("help"+commands.size(), this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
