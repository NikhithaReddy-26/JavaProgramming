package solid.solidDemo.lsp.violation;

public class EmployeeLSP {
    private String name;
    private double salary;

    public EmployeeLSP(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public double calculateBonus() {
        return this.salary * 0.1;
    }
}
