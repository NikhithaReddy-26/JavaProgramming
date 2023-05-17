package nikhitha.assignment5.singleton;

public class MySingleton {
    private static MySingleton instance;
    private String myString;

    private MySingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static MySingleton getInstance(String str) {
        if (instance == null) {
            instance = new MySingleton();
            instance.myString = str;
        }
        return instance;
    }

    public void printMyString() {
        System.out.println(myString);
    }


}


