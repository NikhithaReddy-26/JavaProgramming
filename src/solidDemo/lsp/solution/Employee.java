package solid.solidDemo.lsp.solution;

public class Employee {
    public static void main(String[] args) {

        EmployeeLSP emp1 = new EmployeeLSP("nithi", 12500.50);
        System.out.println("Calculated Salary " + emp1.calculateSalary());
        System.out.println("Calculated Bonus " + emp1.calculateBonus());
        System.out.println("-----------------------");
        SalesEmployee emp = new SalesEmployee("nithi", 125000, 1000);
        System.out.println("Calculated Salary with Commission " + emp.calculateSalary());
        System.out.println("Calculated Bonus with Commission Bonus " + emp1.calculateBonus());
    }
}