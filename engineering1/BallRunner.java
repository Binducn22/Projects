package com.xworkz.engineering1;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Football", 20, 500, "Black", 5, "Leather", 70, 80);
        ball1.initializeBall("Nike", "Inflatable", 60, 180, 400, 2000, 5, 8, 30, 7, 10, 4, 2, 50, 100, 150, 200, 250);

        Ball ball2 = new Ball("Basketball", 25, 600, "Orange", 3, "Rubber", 60, 70);
        ball2.initializeBall("Spalding", "Inflatable", 70, 220, 500, 2500, 6, 9, 35, 8, 10, 5, 3, 60, 120, 180, 220, 280);

        Ball ball3 = new Ball("Tennis Ball", 10, 200, "Yellow", 2, "Felt", 50, 60);
        ball3.initializeBall("Wilson", "Hollow", 40, 120, 200, 1000, 4, 7, 20, 6, 10, 3, 1, 40, 80, 120, 160, 200);

        Ball[] balls = {ball1, ball2, ball3};
        for (Ball ball : balls) {
            ball.printVariables();
            System.out.println();
        }
    }
}




