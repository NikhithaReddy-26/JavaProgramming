package assignment8;

class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends Exception {}

class MyException {
    public static void myMethod(int num) throws Exception1, Exception2, Exception3 {
        if (num == 1) {
            throw new Exception1();
        } else if (num == 2) {
            throw new Exception2();
        } else if (num == 3) {
            throw new Exception3();
        } else {
            throw new NullPointerException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            MyException.myMethod(4);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getClass().getName());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
