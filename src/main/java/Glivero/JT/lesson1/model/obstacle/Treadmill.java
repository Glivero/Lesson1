package Glivero.JT.lesson1.model.obstacle;

public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "length=" + length +
                '}';
    }
}
