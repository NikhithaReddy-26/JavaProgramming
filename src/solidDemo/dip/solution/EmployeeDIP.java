package solid.solidDemo.dip.solution;

public class EmployeeDIP {
    private Database database;

    public EmployeeDIP(Database database) {

        this.database = database;
    }

    public void saveEmployee() {

        database.save();
    }
}
