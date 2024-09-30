/*Mohammed Qutu
2/10/24
Methods: Calculate area and perimeter of a square
*/

import java.util.Scanner;

public class SquareCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to calculating a square.\n");
        System.out.print("Please begin by entering one side of a square: ");
        int input = keyboard.nextInt();
        
        int area = calculateArea(input);
        int perimeter = calculatePerimeter(input);
        
        System.out.println("\nThe area is: " + area + "\nThe perimeter is: " + perimeter);
    }

    // Method to calculate the area of the square
    public static int calculateArea(int lengthOfSide) {
        return lengthOfSide * lengthOfSide;
    }

    // Method to calculate the perimeter of the square
    public static int calculatePerimeter(int lengthOfSide) {
        return lengthOfSide * 4;
    }
}
