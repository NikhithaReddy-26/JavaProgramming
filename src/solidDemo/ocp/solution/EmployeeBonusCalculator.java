package solid.solidDemo.ocp.solution;

public class EmployeeBonusCalculator implements EmployeeSalaryCalculator {
    private EmployeeSalaryCalculator employee;

    public EmployeeBonusCalculator(EmployeeSalaryCalculator employee) {

        this.employee = employee;
    }

    @Override
    public double calculateSalary() {

        return employee.calculateSalary() * 1.1;
    }
}
