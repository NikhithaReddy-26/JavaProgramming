package solid.solidDemo.isp.violates;

public class Employee {
    public static void main(String[] args) {

        Accountant acc1 = new Accountant();
        acc1.work();
        acc1.takeBreak();
        acc1.debuggingCode();
        acc1.analysingFinancial();
        System.out.println();
        Engineer eng = new Engineer();
        eng.work();
        eng.takeBreak();
        eng.debuggingCode();
        eng.analysingFinancial();

    }
}