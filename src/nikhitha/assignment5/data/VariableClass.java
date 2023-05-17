package nikhitha.assignment5.data;

public class VariableClass {

    private int variableInt; // int member variable that is not initialized
    private char variableChar; // char member variable that is not initialized

public void printVariables() {
        System.out.println("variableInt= " + variableInt);
        System.out.println("variableChar = " + variableChar);
        }

public void printLocalVariables() {
        int localInt = 0; // local variable initialized to a default value of 0
        char localChar = '\0';
        System.out.println("localInt = " + localInt);
        System.out.println("localChar = " + localChar);
        }
        }
