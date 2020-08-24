package Glivero.JT.lesson1.service;

import Glivero.JT.lesson1.model.obstacle.Obstacle;
import Glivero.JT.lesson1.model.obstacle.Treadmill;
import Glivero.JT.lesson1.model.obstacle.Wall;
import Glivero.JT.lesson1.model.participant.Athlete;

public class ChallengeService {
    public boolean check(Athlete athlete, Obstacle obstacle) {

        if (obstacle instanceof Wall) {
            int width = ((Wall) obstacle).getHeight();
            int maxWidth = athlete.getMaxHeight();
            athlete.jump();
            return maxWidth >= width;
        } else if (obstacle instanceof Treadmill) {
            int length = ((Treadmill) obstacle).getLength();
            int maxLenght = athlete.getMaxLenght();
            athlete.run();
            return maxLenght >= length;
        }
        throw new RuntimeException("Unknown obstacle");


    }
}
