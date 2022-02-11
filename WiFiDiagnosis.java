/*
 *COURSE: cmsc203
 *INSTRUCTOR: Professor Gary Thai
 *DESCRIPTION: Basically we are suppose to make
 *a java application that will step the user through
 *possible problems that may fix their internet connectivity.
 *PROJECT 1: Wi-fi Diagnosis
 *PROGRAMMER NAME: Mohammed Ali
 *DUE DATE: 02/11/2022
 *COMPILER: Eclipse
 *
 *I pledge that I have completed the programming assignment independently.
 *I have no copied the code from a student or any source.
 *I have no given my code to any student.
 *Print name: Mohammed Ali
 */

import java.util.Scanner; //import from library needed for input from user

public class WiFiDiagnosis	//name of class must match .java file name
{
	public static void main(String[] args)	//main method
	{
//i ask the question multiple time so instead of typing it back to back, i can just put variable
		final String QUESTION_TO_ASK = "Are you able to connect with the internet now? (yes or no)";
//i want to make sure that the programmer name is displayed in the end
		final String PROGRAMMER_CREDITS = "Programmer: Mohammed Ali\nThank you for using my program!";
		String inputYesNo; //feedback variable
		
		Scanner keyboard = new Scanner(System.in);	//scanner object to read input
		
		System.out.println("If you are having problems with the "+
							"internet connection, this Wi-Fi "+
							"Diagnosis may be able to help you out!\n");	//prompt text, then skip line
		//first diagnosis
		System.out.println("First thing's first, reboot your computer and try to connect!"); //output step1
		System.out.println(QUESTION_TO_ASK);	//output constant question
		inputYesNo = keyboard.nextLine();		//input yes or no from user
		//i used a while loop here in case the user types something other than a yes or no
		//i also put IgnoreCase just in case the user types yes in weird ways: yes YES yEs. etc
		while(!(inputYesNo.equalsIgnoreCase("yes")) && !(inputYesNo.equalsIgnoreCase("no")))
		{
			System.out.println("Please only enter yes or no!");	//output to notify to only put yes or no
			System.out.println(QUESTION_TO_ASK);	//constant question
			inputYesNo = keyboard.nextLine();		//input yes or no
		}
		
		if (inputYesNo.equalsIgnoreCase("yes"))		//if BooleanExpression if answer is yes
		{
			System.out.println("Rebooting your computer seems to have worked! Enjoy!");	//output success
			System.out.println(PROGRAMMER_CREDITS);	//my credits
			keyboard.close();	//close scanner
			System.exit(0);	 //exiting program so it doesn't start the second diagnosis, no need to continue
		}
		
		//second diagnosis
		System.out.println("Second, try rebooting your router!");
		System.out.println(QUESTION_TO_ASK);
		inputYesNo = keyboard.nextLine();
		while(!(inputYesNo.equalsIgnoreCase("yes")) && !(inputYesNo.equalsIgnoreCase("no")))
		{
			System.out.println("Please only enter yes or no!");
			System.out.println(QUESTION_TO_ASK);
			inputYesNo = keyboard.nextLine();
		}
		
		if (inputYesNo.equalsIgnoreCase("yes"))
		{
			System.out.println("Rebooting your router seems to have worked! Enjoy!");
			System.out.println(PROGRAMMER_CREDITS);
			keyboard.close();
			System.exit(0);
		}
		
		//third diagnosis
		System.out.println("Third, make sure that the cables connecting to the router "
				+"are firmly plugged in and power is reaching the router!");
		System.out.println(QUESTION_TO_ASK);
		inputYesNo = keyboard.nextLine();
		while(!(inputYesNo.equalsIgnoreCase("yes")) && !(inputYesNo.equalsIgnoreCase("no")))
		{
			System.out.println("Please only enter yes or no!");
			System.out.println(QUESTION_TO_ASK);
			inputYesNo = keyboard.nextLine();
		}
		
		if (inputYesNo.equalsIgnoreCase("yes"))
		{
			System.out.println("Making sure cables are connected to the router seems"
							+ " to have worked! Enjoy!");
			System.out.println(PROGRAMMER_CREDITS);
			keyboard.close();
			System.exit(0);
		}
		
		//fourth diagnosis
		System.out.println("Fourth, trying moving the computer or laptop "
							+"closer to the router and try to connect!");
		System.out.println(QUESTION_TO_ASK);
		inputYesNo = keyboard.nextLine();
		while(!(inputYesNo.equalsIgnoreCase("yes")) && !(inputYesNo.equalsIgnoreCase("no")))
		{
			System.out.println("Please only enter yes or no!");
			System.out.println(QUESTION_TO_ASK);
			inputYesNo = keyboard.nextLine();
		}
		
		if (inputYesNo.equalsIgnoreCase("yes"))
		{
			System.out.println("Moving closer to the router seems to have worked! Enjoy!");
			System.out.println(PROGRAMMER_CREDITS);
			keyboard.close();
			System.exit(0);
		}
		
		else	//if nothing seemed to help, the user has no choice but to contact their IPS
		{
			System.out.println("Alright, now it seems like you must contact your "
							+ "Internet Service Provider(IPS)!");	//help ending message
			System.out.println(PROGRAMMER_CREDITS);
			keyboard.close();
			System.exit(0);
		}
		
	}
}
