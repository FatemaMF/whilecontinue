/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whilecontinue;

/**
 *
 * @author almadkhal3
 */
public class Whilecontinue {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x=0;
        int count = 20;
		// While loop for iteration
		while (count >= 0) {
			if (count == 7 || count == 15) {
				count--;
				// Decrementing variable initialized above
				// Showing continue execution inside loop
				// skipping when count==7 or count==15
				continue;
			}
			// Printing values after continue statement
			System.out.print(count + " ");

			// Decrementing the count variable
			count--;
		}
                System.out.println("the end");
    }
}
