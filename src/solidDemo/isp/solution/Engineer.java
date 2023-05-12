package solid.solidDemo.isp.solution;

public class Engineer implements Work, CodeBase {
    @Override
    public void work() {
        System.out.println("Status => Busy!");
    }

    @Override
    public void takeBreak() {
        System.out.println("Status => On Break");
    }

    @Override
    public void debuggingCode() {
        System.out.println("Engineer is busy in debugging of code.");
    }

}
