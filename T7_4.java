package text4;

import java.util.Scanner;

public class T7_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int[] numbers = new int[10]; 

		    // How many distinct numbers are in the array
		    int numberOfDistinctValues = 0; 
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter ten numbers: ");

		    for (int i = 0; i < numbers.length; i++) {

		      int value = input.nextInt();

		      boolean isInTheArray = false;
		      for (int j = 0; j < numberOfDistinctValues; j++) {
		      	if (value == numbers[j]) {
		          isInTheArray = true;
		      	}
		      }
		      
		      if (!isInTheArray) {
		      	numbers[numberOfDistinctValues] = value;
 
		      	numberOfDistinctValues++;
		      }
		    }

		    System.out.println("The number of distinct values is " + numberOfDistinctValues);
		    
		    for (int i = 0; i < numberOfDistinctValues; i++)
		      System.out.print(numbers[i] + " ");
		  }

}
