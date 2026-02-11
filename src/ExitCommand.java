public class ExitCommand implements Command {
    @Override
    public void execute(Input input) {
        System.exit(0);
    }
}
