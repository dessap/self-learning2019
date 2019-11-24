package com.company;

public class Main {

    public static void main(String[] args) {
        /*new JavaKeywords();
        new OperatorsChallenge(20.00, 80.00);*/

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        int position = calculateLeaderboardPosition(finalScore);
        displayHighScorePosition("Thomas", position, finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        position = calculateLeaderboardPosition(finalScore);
        displayHighScorePosition("Andressa", position, finalScore);

    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    private static int calculateLeaderboardPosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

    private static void displayHighScorePosition(String playerName, int position, int finalScore) {
        System.out.println("Player " + playerName + "'s leaderboard position is " + position + " with a final score of " + finalScore);
    }
}