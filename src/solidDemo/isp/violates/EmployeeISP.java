package solid.solidDemo.isp.violates;

// Bad implementation - violates ISP
public interface EmployeeISP {
    void work();

    void takeBreak();

    void debuggingCode();

    void analysingFinancial();
}
