import java.util.Scanner;
import java.io.*;
import java.util.Date;

public class Hello {

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name and hit return.");
		
		String name = in.nextLine();

		System.out.println("Hello " + name);

		System.out.println("The current date and time is " + new Date());
    }
}