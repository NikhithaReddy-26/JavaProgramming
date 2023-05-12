package solid.solidDemo.srp.solution;

import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {
        EmployeeSRP emp1 = new EmployeeSRP("Deep Singhania", "Greater Noida", 70000.0);
        System.out.println(emp1.calculateSalary());
        EmployeeSRP emp2 = new EmployeeSRP("John Ram", "NY City", 895632.58);

        EmployeeDetails manager = new EmployeeDetails();
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        // Traverse the employeeList
        System.out.println("Employee Details:");
        for (EmployeeSRP emp : manager.getEmployees()) {
            System.out.println("Name: " + emp.getName() + ", Address: " + emp.getAddress());
        }
    }
}
