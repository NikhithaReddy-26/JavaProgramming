package solid.solidDemo.ocp.violation;

public class EmployeeOCP {
    private String name;
    private double salary;

    public EmployeeOCP(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public double calculateBonus() {
        return this.salary * 0.1; // violating the OCP as it modifies the existing code
    }
}
