//import stuff here!

import java.util.Scanner;

//Your code here
public class Program6 {
    public static void main(String[] args) {
        //declare variables
        double radius = 0;

        //program stuff that actually does stuff
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = numScanner.nextDouble();
        final double pi = 3.14159;
        double diameter = 2 * radius;
        double area = pi * radius * radius;
        double circ = pi * diameter;
        area = (int) (area * 1000);
        area = area/1000;
        circ = (int) (circ * 1000);
        circ = circ/1000;
        System.out.println("The Radius of the circle = " +  radius + "\n");
        System.out.println("The Diameter of the circle = " + diameter + "\n");
        System.out.println("The Area of the circle = " + area + "\n");
        System.out.println("The Circumfrence of the circle = " + circ + "\n");

    }





    }
//Paste console output below:
/*

Enter the radius: 
3.712
The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the circle = 43.287

The Circumfrence of the circle = 23.323

*/
