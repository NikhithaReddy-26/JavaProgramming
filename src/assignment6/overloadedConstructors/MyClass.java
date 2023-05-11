package assignment6.overloadedConstructors;
public class MyClass {
    private int myInt;
    private String myString;

    // First constructor with one argument
    public MyClass(int myInt) {
        // Call the second constructor using this()
        this(myInt, "default");
    }

    // Second constructor with two arguments
    public MyClass(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }

    // Getters and setters
    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
}
