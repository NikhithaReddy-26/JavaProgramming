package solid.solidDemo.dip.violation;

import java.util.ArrayList;


public class Employee {
    public static void main(String[] args) {

        EmployeeDetails emp = new EmployeeDetails("nithi", 18000);
        EmployeeDatabase empDB = new EmployeeDatabase();
        empDB.save(emp);
        empDB.fetchEmployeeDetail();
    }
}