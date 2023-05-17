package assignment7.InnerclassesProgram;

public class InheritedInnerClass extends OuterClass.InnerClass {
    public InheritedInnerClass(OuterClass outer, int inheritedValue) {
        outer.super(inheritedValue);
    }
}
