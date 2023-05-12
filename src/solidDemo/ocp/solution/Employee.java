package solid.solidDemo.ocp.solution;

public class Employee {
    public static void main(String[] args) {
        EmployeeOCP emp1 = new EmployeeOCP("tina", 1000);
        System.out.println(emp1.calculateSalary());

        EmployeeBonusCalculator emp2 = new EmployeeBonusCalculator(emp1);
        System.out.println(emp2.calculateSalary());

    }
}
