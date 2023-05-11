package assignment7.CycleInterface;

public class TricycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Tricycle();
    }
}