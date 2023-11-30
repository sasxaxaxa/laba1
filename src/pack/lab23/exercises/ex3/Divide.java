package pack.lab23.exercises.ex3;

public class Divide extends Expression {
    private Expression one;
    private Expression two;

    public Divide(Expression one, Expression two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public double evaluate(double x) {
        return one.evaluate(x) / two.evaluate(x);
    }
}