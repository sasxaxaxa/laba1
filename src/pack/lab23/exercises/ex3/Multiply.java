package pack.lab23.exercises.ex3;

public class Multiply extends Expression {
    private Expression one;
    private Expression two;

    public Multiply(Expression left, Expression right) {
        this.one = left;
        this.two = right;
    }

    @Override
    public double evaluate(double x) {
        return one.evaluate(x) * two.evaluate(x);
    }
}

