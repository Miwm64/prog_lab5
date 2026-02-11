import java.util.Map;

public class AddCommand implements Command {
    Map<String, Command> commands;
    CollectionManager collectionManager;
    AddCommand(Map<String, Command> commands, CollectionManager collectionManager) {
        this.commands = commands;
        this.collectionManager = collectionManager;
    }
    public  void execute() {}
    public void execute(Input input) {
        AddInput addInput = (AddInput) input;
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.name = addInput.name;
        studyGroup.peopleAmount = addInput.peopleAmount;
        collectionManager.add(studyGroup);
        commands.put("add"+commands.size(), this);
    }
}
