package com.company.obstacles;

import com.company.participants.Competitor;

public class Water extends Obstacle {
    private final int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void pass(Competitor competitor) {
        competitor.swim(distance);
    }
}
