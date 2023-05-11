package assignment7.InnerclassesProgram;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = outer.new InnerClass(20);
        System.out.println("Outer value: " + outer.getValue());
        System.out.println("Inner value: " + inner.getInnerValue());

        InheritedInnerClass inheritedInner = new InheritedInnerClass(outer, 30);
        System.out.println("Inherited inner value: " + inheritedInner.getInnerValue());
    }
}
