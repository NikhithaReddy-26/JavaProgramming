package solid.solidDemo.ocp.solution;

public class EmployeeOCP implements EmployeeSalaryCalculator {
    private String name;
    private double salary;

    public EmployeeOCP(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}
