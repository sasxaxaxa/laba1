package pack.lab24.exercises.ex2;

public class ChairFactory {
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
