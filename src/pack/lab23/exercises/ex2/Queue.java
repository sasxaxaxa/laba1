package pack.lab23.exercises.ex2;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    T first();

    int size();

    boolean isEmpty();
}