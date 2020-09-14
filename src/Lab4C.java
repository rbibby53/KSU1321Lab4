//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 4

import java.util.Scanner;
import static java.lang.System.*;

public class Lab4C {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.println("Select from the following: ");
        out.print("To see a list of movies, press 1.\n" + "To see show times, press 2.\n" + "To pay your bill, press 3.\n");
        out.print("Choice: ");
        int number = input.nextInt();


        switch (number) {
            case 1:
                System.out.print("The Neverending Story 6\n" +
                        "Princess Diaries: the untold story\n" +
                        "Monty Python and the Programmer");
                break;
            case 2:
                System.out.print("All movies play at 3PM.");
                break;
            case 3:
                System.out.print("Corporate accounts payable, Nina speaking.\n" + "Just a moment!");
                break;
            default:
                System.out.print("I'm sorry, Dave. I can't do that.");
                break;

        }
    }
}
