package solid.solidDemo.ocp.violation;

public class Employee {
    public static void main(String[] args) {
        EmployeeOCP emp1 = new EmployeeOCP("Nikhitha", 100000.35);

        System.out.println(emp1.calculateSalary());
        System.out.println(emp1.calculateBonus());

    }
}
