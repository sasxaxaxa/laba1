package pack.lab3.circle_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CircleArray {
    private static ArrayList<Circle> circles;
    public CircleArray() {this.circles = new ArrayList<>();}
    public ArrayList<Circle> getCircles() {return circles;}

    public void Adder(Circle circle) {circles.add(circle);}
    public Circle firstCircle() {
        return Collections.min(circles, Comparator.comparing(Circle::getR));
    }
    public Circle lastCircle() {
        return Collections.max(circles, Comparator.comparing(Circle::getR));
    }
    public void sortingCircles() {Collections.sort(circles, Comparator.comparing(Circle::getR));}
}