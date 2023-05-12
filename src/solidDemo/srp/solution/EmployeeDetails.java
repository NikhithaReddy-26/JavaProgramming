package solid.solidDemo.srp.solution;

import java.util.ArrayList;

public class EmployeeDetails {
    private ArrayList<EmployeeSRP> employeeList = new ArrayList<EmployeeSRP>();

    public void addEmployee(EmployeeSRP employee) {
        employeeList.add(employee);
    }

    public ArrayList<EmployeeSRP> getEmployees() {
        return employeeList;
    }
}
