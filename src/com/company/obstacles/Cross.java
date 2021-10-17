package com.company.obstacles;

import com.company.participants.Competitor;

public class Cross extends Obstacle {
    private final int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void pass(Competitor competitor) {
        competitor.run(distance);
    }
}
