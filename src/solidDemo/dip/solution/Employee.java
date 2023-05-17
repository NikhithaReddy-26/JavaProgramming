package solid.solidDemo.dip.solution;
// follow DIP principle
import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {

        Database employeeDatabase = new EmployeeDatabase();
        EmployeeDIP employeeDIP = new EmployeeDIP(employeeDatabase);
        employeeDIP.saveEmployee();

        ArrayList<EmployeeDetails> employees = ((EmployeeDatabase) employeeDatabase).getEmployees();
        for (EmployeeDetails employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}
