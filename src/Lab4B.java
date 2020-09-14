//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 4

import java.util.Scanner;
import static java.lang.System.*;

public class Lab4B {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Number of hours this week: ");
        float hours = input.nextFloat();
        float overtime = 0;

        if (hours > 40){
            overtime = hours - 40;
            hours = hours - 40;
        }
        float pay = (hours*15) + (overtime*25);
        out.print(pay);
    }
}
