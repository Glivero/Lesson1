package Glivero.JT.lesson1.model.participant;

public class Cat implements Athlete {

    private String name;
    private int maxLength;
    private int maxHeight;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public void run() {
        System.out.println(name + " бежит максимум: " + maxLength);
    }

    public void jump() {
        System.out.println(name + " прыгает  максимум: " + maxHeight);
    }

    public String getName() {
        return name;
    }

    public int getMaxLenght() {
        return 0;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", maxLength=" + maxLength +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
