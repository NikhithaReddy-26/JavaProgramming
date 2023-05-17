package solid.solidDemo.isp.violates;

public class Accountant implements EmployeeISP {
    @Override
    public void work() {
        System.out.println("Accountant is Busy!");
    }

    @Override
    public void takeBreak() {

        System.out.println("Accountant is on break");
    }

    @Override
    public void debuggingCode() {
        System.out.println("Accountant not required to debug the code.");
    }

    @Override
    public void analysingFinancial() {
        System.out.println("Accountant analyzing the financials f firm.");
    }

}
