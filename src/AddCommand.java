import java.util.Map;

public class AddCommand implements Command {
    Map<String, Command> commands;
    CollectionManager collectionManager;
    AddCommand(Map<String, Command> commands, CollectionManager collectionManager) {
        this.commands = commands;
    }

    @Override
    public void execute() {

    }
}
