package Glivero.JT.lesson1.service;

import Glivero.JT.lesson1.model.obstacle.Obstacle;
import Glivero.JT.lesson1.model.participant.Athlete;

import java.util.List;

public class Challenge {

    private ChallengeService challengeService;

    public Challenge(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    public List<Athlete> run(List<Athlete> athletes, List<Obstacle> obstacles) {

        for (Obstacle obstacle : obstacles) {
            for (Athlete athlete : athletes) {
                boolean passed = challengeService.check(athlete, obstacle);
                if (!passed) {
                    athletes.remove(athlete);
                }
            }

        }
        return athletes;
    }

}
