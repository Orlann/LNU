package stringTasks.task6_SalaryReport;

public class Task6 {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[4];
        employeeArray[0] = new Employee("Andriy Zvir", 8500);
        employeeArray[1] = new Employee("Olga Petriv", 5500);
        employeeArray[2] = new Employee("Iryna Radist", 11500);
        employeeArray[3] = new Employee("Vasyl Malyk", 12500);


        Employee[] employees2 = {new Employee("Bogdan Zvir", 5000),
                new Employee("Andriy Kvit", 10000),
                new Employee("Svitlana Brova", 11200),
                new Employee("Galyna Chemna", 13500)};

        Report.generateReport(employeeArray);
        Report.generateReport(employees2);
    }
}
