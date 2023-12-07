package pack.lab24.exercises.ex2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}
