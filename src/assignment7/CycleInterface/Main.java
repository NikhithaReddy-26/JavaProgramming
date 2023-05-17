package assignment7.CycleInterface;

public class Main {
    public static void rideCycle(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        CycleFactory unicycleFactory = new UnicycleFactory();
        Cycle unicycle = unicycleFactory.createCycle();
        rideCycle(unicycle);

        CycleFactory bicycleFactory = new BicycleFactory();
        Cycle bicycle = bicycleFactory.createCycle();
        rideCycle(bicycle);

        CycleFactory tricycleFactory = new TricycleFactory();
        Cycle tricycle = tricycleFactory.createCycle();
        rideCycle(tricycle);
    }
}
