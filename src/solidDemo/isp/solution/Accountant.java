package solid.solidDemo.isp.solution;

public class Accountant implements Work, Financial {
    @Override
    public void work() {
        System.out.println("Status => Busy!");
    }

    @Override
    public void takeBreak() {
        System.out.println("Status => On Break");
    }


    @Override
    public void analyzingFinancial() {
        System.out.println("Accountant is analyzing financials of Organization");
    }
}
