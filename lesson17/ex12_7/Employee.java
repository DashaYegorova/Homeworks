package lesson17.ex12_7;

import lesson10.Reader;

import java.util.Objects;

public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Вася Васин", 3500);
        Employee employee2 = new Employee("Петя Петин", 4300);
        Employee employee3 = new Employee("Иван Иванов", 5600);
        Employee employee4 = new Employee("Кирилл Кириллов", 6200);
        Employee [] employees = {employee1, employee2, employee3, employee4};
        Report.generateReport(employees);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullName, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
