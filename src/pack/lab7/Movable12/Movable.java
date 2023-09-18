package pack.lab7.Movable12;

public interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}
class MovablePoint implements Movable {
    private  int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}

class MovableRectangle implements Movable {
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topleft, MovablePoint bottomRight) {
        this.topleft = topleft;
        this.bottomRight = bottomRight;
    }

    boolean SpeedTest(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        if (xSpeed == ySpeed) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topleft=" + topleft +
                ", bottomRight=" + bottomRight +
                '}';
    }


    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
