//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 4

import java.util.Scanner;
import static java.lang.System.*;

public class Lab4D {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Gallons of water: ");
        int water = input.nextInt();
        int more2 = 0, more1 = 0;
        if (water > 2000){
            more2 = water - 2000;
            water = 2000;
        }
        if (water > 1000){
            more1 = water - 1000;
            water = 1000;
        }
        double total = (water*.15) + (more1*.25) + (more2*.35);
        out.print("Water bill is: $" + total);
    }
}
