package solid.solidDemo.isp.violates;

public class Engineer implements EmployeeISP {
    @Override
    public void work() {
        System.out.println("Engineer is busy for now.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Engineer is on break.");
    }

    @Override
    public void debuggingCode() {
        System.out.println("Engineer is debugging the code base.");
    }

    @Override
    public void analysingFinancial() {
        System.out.println("Engineer don't need to analyze the financials.");
    }
}
