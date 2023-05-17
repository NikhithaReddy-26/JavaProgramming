package solid.solidDemo.dip.solution;

import java.util.ArrayList;

public class EmployeeDatabase implements Database {
    private ArrayList<EmployeeDetails> employees;

    public EmployeeDatabase() {

        employees = new ArrayList<>();
    }

    @Override
    public void save() {
        employees.add(new EmployeeDetails("nithi", 50000.0));
    }

    public ArrayList<EmployeeDetails> getEmployees() {

        return employees;
    }
}
