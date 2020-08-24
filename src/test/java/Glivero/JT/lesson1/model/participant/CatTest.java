package Glivero.JT.lesson1.model.participant;

import Glivero.JT.lesson1.model.obstacle.Obstacle;
import Glivero.JT.lesson1.model.obstacle.Treadmill;
import Glivero.JT.lesson1.model.obstacle.Wall;
import Glivero.JT.lesson1.service.ChallengeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CatTest {
    ChallengeService challengeService = new ChallengeService();

    @Test
    void getName() {
        Athlete catBoris = new Cat("Boris", 15, 8);
        Obstacle wall = new Wall(5);

        ChallengeService challengeService = new ChallengeService();
        boolean passed = challengeService.check(catBoris, wall);
        Assertions.assertTrue(passed);

    }

    @ParameterizedTest
    @MethodSource("data")
    public void testAllCombinations(Athlete athlete, Obstacle obstacle, boolean passed) {
        boolean actual = challengeService.check(athlete, obstacle);
        Assertions.assertEquals(passed, actual);
    }

    public static Stream<Arguments> data() {

        Athlete catTom = new Cat("Tom", 10, 5);
        Athlete catLarry = new Cat("Larry", 7, 3);
        Athlete catBoris = new Cat("Boris", 15, 8);

        Athlete humanMax = new Human("Max", 13, 4);
        Athlete humanAnna = new Human("Andrey", 10, 2);
        Athlete humanAlex = new Human("Alex", 18, 6);

        Athlete robotVally = new Robot("Vally", 13, 4);
        Athlete robotEva = new Robot("Chappy", 10, 2);
        Athlete robotBender = new Robot("Bender", 18, 6);


        Athlete[] athletes = {catTom, catLarry, catBoris, humanMax, humanAnna, humanAlex, robotVally, robotEva, robotBender};

        Obstacle wall = new Wall(5);
        Obstacle wall1 = new Wall(6);
        Obstacle wall2 = new Wall(7);

        Obstacle treadmill = new Treadmill(10);
        Obstacle treadmill1 = new Treadmill(14);
        Obstacle treadmill2 = new Treadmill(15);

        return Stream.of(
                Arguments.of(robotBender, wall, true),
                Arguments.of(catBoris, wall1, true),
                Arguments.of(catBoris, wall, true),
                Arguments.of(catBoris, wall2, true),
                Arguments.of(catBoris, wall2, true)
        );
    }
}