package solid.solidDemo.lsp.violation;

public class SalesEmployee extends EmployeeLSP {
    private double commission;

    public SalesEmployee(String name, double salary, double commission) {
        super(name, salary);
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.commission;
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus() + this.commission * 0.05; // violates LSP as it does not meet the contract of the base class
    }
}
