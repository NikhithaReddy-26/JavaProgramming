package solid.solidDemo.dip.violation;

import java.util.ArrayList;

public class Database {
    public void printEmployeeDetails(ArrayList<EmployeeDetails> employeeList) {

        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("Name : " + employeeList.get(i).getName() + " Salary : " + employeeList.get(i).getSalary());
        }

    }
}
