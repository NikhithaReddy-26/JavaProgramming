package nikhitha.assignment5.singleton;

public class implementation {

    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance("Hello, world!");
        singleton.printMyString(); // Output: Hello, world!
    }
}