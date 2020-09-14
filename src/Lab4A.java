//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 4

import java.util.Scanner;
import static java.lang.System.*;

public class Lab4A {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Enter the day: ");
        String day = input.nextLine();

        if (day.equals("Monday")){
            out.print("Sounds like someone has a case of the Mondays!");
        }else if (day.equals("Tuesday")) {
            out.print("It's another day of the week.");
        }else if (day.equals("Wednesday")) {
            out.print("It's hump day! El ombligo!");
        }else if (day.equals("Thursday")) {
            out.print("Almost there!");
        }else if (day.equals("Friday")) {
            out.print("Finally. It's Friday!");
        }else{
            out.print("That's not an option!");
        }
    }
}
