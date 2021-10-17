package com.company.participants;

public abstract class Animal implements Competitor{

    String type;

    String name;

    int maxRunDistance;

    int maxJumpHeight;

    int maxSwimDistance;

    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(type + " " + name + " " + " успешно справился с кросс");
        } else {
            System.out.println(type + " " + name + " " + " сдох");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(type + " " + name + " " + " успешно справился с препятствием");
        } else {
            System.out.println(type + " " + name + " " + " убился о препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <= maxSwimDistance){
            System.out.println(type + " " + name + " " + " проплыл дистанцию");
        } else {
            System.out.println(type + " " + name + " " + " утонул");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(type + " " + name + ": " + onDistance);
    }

}
