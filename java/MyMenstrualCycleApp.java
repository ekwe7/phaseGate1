import java.util.Scanner;

public class MyMenstrualCycleApp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("=== WELCOME TO MY MENSTRUAL CYCLE APP CALCULATOR ===");

System.out.print("Enter the date of your last cycle period(yyyy-mm-dd): ");
String lastPeriod = input.nextLine();

System.out.print("How many days do your cycle last: ");
int cycleLength = input.nextInt();

System.out.print("Enter number of times you want to check: ");
int numberOfCycles = input.nextInt();

String mycycleInfo = MenstrualCycleApp.menstrualCycle(lastPeriod, cycleLength, numberOfCycles);
System.out.println(mycycleInfo);


	}
}

