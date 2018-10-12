package stringTasks.task1;

public class Task1Methods {
    public static void printLastCharacter(String string){
        int lastChar = string.length()-1;
        System.out.println(string.charAt(lastChar));
    }

    public static boolean endWithCharacters(String string, String ending){
        return string.endsWith(ending);
    }

    public static boolean startWithCharacters(String string, String begining){
        return string.startsWith(begining);
    }

    public static int positionInText(String string, String substring){
        return string.indexOf(substring);
    }

    public static String changeCharacters(String string, char c1, char c2){
        return string.replace(c1,c2);
    }
}
