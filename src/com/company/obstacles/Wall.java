package com.company.obstacles;

import com.company.participants.Competitor;

public class Wall extends Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void pass(Competitor competitor) {
        competitor.jump(height);
    }
}
