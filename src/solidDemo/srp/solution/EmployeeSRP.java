package solid.solidDemo.srp.solution;

public class EmployeeSRP {
    private String name;
    private String address;
    private double salary;

    public EmployeeSRP(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
