package solid.solidDemo.dip.violation;

import java.util.ArrayList;

public class EmployeeDatabase extends Database {
    //    private Database database;
    private ArrayList<EmployeeDetails> employeeList = new ArrayList<>();

    public void save(EmployeeDetails employeeDetail) {

        employeeList.add(employeeDetail);
    }

    public void fetchEmployeeDetail() {

        this.printEmployeeDetails(employeeList);
    }

}
