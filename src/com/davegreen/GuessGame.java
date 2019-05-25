package com.davegreen;

/**
 * Created by daveg on 18/07/2017.
 */
public class GuessGame
{
    Player p1;
    Player p2;
    Player p3;

    public void startGame()
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 11);
        System.out.println("I'm thinking of a number between 0 and 10........");

        while (true)
        {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player 1 guessed " + guessP1);

            guessP2 = p2.number;
            System.out.println("Player 2 guessed " + guessP2);

            guessP3 = p3.number;
            System.out.println("Player 3 guessed " + guessP3);

            if (guessP1 == targetNumber)
            {
                p1IsRight = true;
            }
            if (guessP2 == targetNumber)
            {
                p2IsRight = true;
            }
            if (guessP3 == targetNumber)
            {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight)
            {
                System.out.println("We hava a winner!");
                System.out.println("Player one got it correct? " + p1IsRight);
                System.out.println("Player two got it correct? " + p2IsRight);
                System.out.println("Player three got it correct? " + p3IsRight);
                System.out.println("Game Over");
                break;
            }
            else
            {
                System.out.println("No correct guesses, players will have to try again!");
            }
        }
    }
}
