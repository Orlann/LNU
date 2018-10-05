package stringTasks.task1;

import static stringTasks.task1.Task1Methods.printLastCharacter;
import static stringTasks.task1.Task1Methods.endWithCharacters;
import static stringTasks.task1.Task1Methods.startWithCharacters;
import static stringTasks.task1.Task1Methods.positionInText;
import static stringTasks.task1.Task1Methods.changeCharacters;


public class Task1 {
    public static void main(String[] args) {
        final String TEXT = "I study Java !!!";
        printLastCharacter(TEXT);
        System.out.println(endWithCharacters(TEXT,"!!!"));
        System.out.println(startWithCharacters(TEXT,"I study"));
        System.out.println(positionInText(TEXT,"Java"));
        System.out.println(changeCharacters(TEXT,'a','o'));
    }
}
