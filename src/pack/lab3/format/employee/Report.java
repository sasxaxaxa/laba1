package pack.lab3.format.employee;

import java.util.ArrayList;

public class Report {
    public static void generateReport() {
        String[] fullnames = {"Alexandra", "Ilya", "Kirill", "Artem", "Andrew"};
        double[] salaries = {100000, 120, 44, 1, 880};

        ArrayList<Employee> array = new ArrayList();

        for (int i = 0; i < fullnames.length; i++) {
            Employee employee = new Employee(fullnames[i], salaries[i]);
            array.add(employee);
        }
        for (Employee employee : array) {
            System.out.printf("Сотрудник: %-15s %15s0 RUB%n", employee.getFullname(), employee.getSalary());
        }
    }
    public static void main(String[] args) {
        generateReport();
    }
}
