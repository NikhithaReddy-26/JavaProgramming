package assignment7.interfaces;

public class Main {
    public static void methodWithInterface1(Interface1 obj) {
        System.out.println("Calling method1 from Interface1.");
        obj.method1();
        System.out.println("Calling method2 from Interface1.");
        obj.method2();
    }

    public static void methodWithInterface2(Interface2 obj) {
        System.out.println("Calling method3 from Interface2.");
        obj.method3();
        System.out.println("Calling method4 from Interface2.");
        obj.method4();
    }

    public static void methodWithInterface3(Interface3 obj) {
        System.out.println("Calling method5 from Interface3.");
        obj.method5();
        System.out.println("Calling method6 from Interface3.");
        obj.method6();
    }

    public static void methodWithCombinedInterface(CombinedInterface obj) {
        System.out.println("Calling method7 from CombinedInterface.");
        obj.method7();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();


        methodWithInterface1(obj);
        methodWithInterface2(obj);
        methodWithInterface3(obj);


        methodWithCombinedInterface(obj);
    }
}
