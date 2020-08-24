package Glivero.JT.lesson1.model.obstacle;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }
}