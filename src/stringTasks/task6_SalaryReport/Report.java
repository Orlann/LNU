package stringTasks.task6_SalaryReport;

import com.sun.xml.internal.ws.util.StringUtils;

public class Report {
    public static void generateReport(Employee[] employees){
        for (Employee employee: employees) {
            System.out.printf("%-20s %20.2f %n",employee.getFullname(),employee.getSalary());
        }
    }
}
