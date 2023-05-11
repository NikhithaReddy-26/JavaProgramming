package assignment7.InnerclassesProgram;

public class OuterClass {
    private int value;

    public OuterClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public class InnerClass {
        private int innerValue;

        public InnerClass(int innerValue) {
            this.innerValue = innerValue;
        }

        public int getInnerValue() {
            return innerValue;
        }
    }
}
