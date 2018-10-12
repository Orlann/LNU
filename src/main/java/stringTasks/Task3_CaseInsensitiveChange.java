package stringTasks;

public class Task3_CaseInsensitiveChange {
    final static String TEXT = "I study Object Oriented Programming. I like object oriented programming";
    public static void main(String[] args) {
insensitiveChange(TEXT,"");
    }

    public static void insensitiveChange(String text, String newText){
        boolean result = text.matches(".*object oriented programming.*");
        System.out.println(result);
        String newString;
        // наступне не добре, бо шукає стрічку в якій є такий текст і замінює ВСЮ стрічку
//        newString = TEXT.replaceAll("(?i:.*object oriented programming.*)","OOP");
//        System.out.println(newString);

//        (?i) означає, що в наступній стрічці не буде враховуватися реєстр
        String newString2 = TEXT.replaceAll("(?i)object oriented programming","OOP");
        System.out.println(newString2);
    }
}
