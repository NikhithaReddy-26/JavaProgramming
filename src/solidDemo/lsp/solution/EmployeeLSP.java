package solid.solidDemo.lsp.solution;

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

    // new method for calculating bonus based on commission
    public double calculateCommissionBonus(double commission) {
        return commission * 0.05;
    }
}
