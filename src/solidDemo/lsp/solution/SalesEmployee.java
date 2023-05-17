package solid.solidDemo.lsp.solution;

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
        return super.calculateBonus() + super.calculateCommissionBonus(this.commission);
    }
}
