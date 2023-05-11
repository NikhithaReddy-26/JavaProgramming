package assignment6.overloadedConstructors;


public class Main {
    public static void main(String[] args) {

        MyClass myObject1 = new MyClass(10);
        System.out.println("myObject1: myInt = " + myObject1.getMyInt() + ", myString = " + myObject1.getMyString());

        MyClass myObject2 = new MyClass(20, "hello");
        System.out.println("myObject2: myInt = " + myObject2.getMyInt() + ", myString = " + myObject2.getMyString());
    }
}
