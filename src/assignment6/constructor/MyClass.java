package assignment6.constructor;

public class MyClass {
    public MyClass(String s) {
        System.out.println("Initializing MyClass with argument: " + s);
    }

    public static void main(String[] args) {
        MyClass[] myClassArray = new MyClass[5];
    }
}
