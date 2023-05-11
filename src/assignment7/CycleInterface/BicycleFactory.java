package assignment7.CycleInterface;

public class BicycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Bicycle();
    }
}
