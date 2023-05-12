package solid.solidDemo.dip.violation;

public class EmployeeDetails {
    private String name;
    private double salary;

    public EmployeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public double getSalary() {
        return salary;
    }
}
