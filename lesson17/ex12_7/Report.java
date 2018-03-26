package lesson17.ex12_7;

public class Report {
    static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("У %15s зарплата составляет %,10.2f гривен.%n", employee.getFullName(), employee.getSalary());
        }
    }
}
