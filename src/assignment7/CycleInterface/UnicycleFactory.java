package assignment7.CycleInterface;

public class UnicycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Unicycle();
    }
}
