package stringTasks;

import java.util.Scanner;

public class Task5 {

    public static String buildStringWithStudentsMarks(String student, int mark, String subject) {
        String result = String.format("Студент %.15s отримав %3d з %.10s", student, mark, subject);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Прізвище ");
        String student = in.nextLine();
        System.out.print("Предмет ");
        String subject = in.nextLine();
        System.out.print("Оцінка ");
        int mark = in.nextInt();

        System.out.println(buildStringWithStudentsMarks(student, mark, subject));
        System.out.println(buildStringWithStudentsMarks("Petrov", 5076, "Economics"));


    }
}
