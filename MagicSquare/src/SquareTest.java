/**
 * SquareTest.java
 * Author: Vivian Fang, pd. 1
 * Revised 02/15/15
 * Runs the Square.java class and returns whether a set of data is a
 * magic square or not.
 */

import java.util.Scanner;
import java.io.*;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
	    Scanner scan = new Scanner(new File("magicData"));
		int count = 1;                 //count which square we're on
		int size = scan.nextInt();     //size of next square
	
		//Expecting -1 at bottom of input file
		while (size != -1)
		{
	
			//create a new Square of the given size
			Square square = new Square(size);
			//call its read method to read the values of the square
			square.readSquare(scan);
			System.out.println("\n******** Square " + count + " ********");
			//print the square
			square.printSquare();
			//print the sums of its rows
			for(int i = 0; i < size; i ++)
				System.out.println("Row " + (i + 1) + " sum: " + square.sumRow(i));
			//print the sums of its columns
			for(int i = 0; i < size; i ++)
				System.out.println("Col " + (i + 1) + " sum: " + square.sumCol(i));
			//print the sum of the main diagonal
			System.out.println("Main diagnal sum: " + square.sumMainDiag());
			//print the sum of the other diagonal
			System.out.println("Other diagonal sum: " + square.sumOtherDiag());
			//determine and print whether it is a magic square
			System.out.println("Magic square status: " + square.magic());
			//get size of next square
			size = scan.nextInt();
			count++;
		}
   }
}