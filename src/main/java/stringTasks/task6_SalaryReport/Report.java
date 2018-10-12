package stringTasks.task6_SalaryReport;


public class Report {
    public static void generateReport(Employee[] employees){
        for (Employee employee: employees) {
            System.out.printf("%-20s %20.2f %n",employee.getFullname(),employee.getSalary());
        }
    }
}
