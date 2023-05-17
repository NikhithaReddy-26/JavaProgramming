package solid.solidDemo.isp.solution;

public class Employee {
    public static void main(String[] args) {
        Accountant acc1 = new Accountant();
        acc1.work();
        acc1.takeBreak();
        acc1.analyzingFinancial();
        System.out.println();

        Engineer eng = new Engineer();
        eng.work();
        eng.takeBreak();
        eng.debuggingCode();

    }
}
