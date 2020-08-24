package Glivero.JT.lesson1.model.participant;

public class Robot implements Athlete {

    private String name;
    private int maxLength;
    private int maxWeight;
    private boolean success = true;

    public Robot(String name, int maxLength, int maxWeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
    }

    public void run() {
        System.out.println(name + " бежит максимум: " + maxLength);
    }

    public void jump() {
        System.out.println(name + " прыгает  максимум: " + maxWeight);
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
        return maxWeight;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
