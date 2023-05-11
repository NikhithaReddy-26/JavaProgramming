package nikhitha.assignment5.main;
import nikhitha.assignment5.data.VariableClass;
import nikhitha.assignment5.singleton.MySingleton;

public class Main {
    public static void main(String[] args) {
        VariableClass data = new VariableClass();
        data.printVariables(); // Output: myInt: 0, myChar:

        //data.printLocalVariables(); // Compile error: variable localInt might not have been initialized

        MySingleton singleton = MySingleton.getInstance("Hello, world!");
        singleton.printMyString(); // Output: Hello, world!
    }
}
