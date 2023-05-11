package nikhitha.assignment5.data;

public class notInitialised {
    public static void main(String[] args) {
        VariableClass myObj = new VariableClass();
        myObj.printLocalVariables();
    }
}
    //local variables must be initialized with a value before they can be used, or else the compiler will give an error.
   // This error occurs because the printLocalVariables() method defines two local variables localInt and localChar,
   // but does not initialize them.