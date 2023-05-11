package assignment7.cycle;


public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[] { new Unicycle(), new Bicycle(), new Tricycle() };
        for (Cycle c : cycles) {

            c.ride();


            if (c instanceof Unicycle) {
                ((Unicycle) c).balance();
            } else if (c instanceof Bicycle) {
                ((Bicycle) c).balance();
            }
        }
    }
}