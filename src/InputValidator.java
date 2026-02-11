import java.util.Scanner;

public class InputValidator extends Input {
    static Scanner scanner = new Scanner(System.in);

    InputValidator(Scanner scanner) {
        InputValidator.scanner = scanner;
    }

    static AddInput addInput() {
        AddInput addInput = new AddInput();
        addInput.name = scanner.nextLine();
        addInput.peopleAmount = scanner.nextInt();
        return addInput;
    }
}

