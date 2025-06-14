
import java.util.Scanner;
import java.util.Arrays;

public class MyStudentScoreSheet{

static Scanner scanner = new Scanner(System.in);



public static void main(String[] args){

System.out.println("=== STUDENT SCORE SHEET ===\n");

int studentCount = getNumber("students");
int subjectCount = getNumber("subjects");



String[] subjectNames = getSubjectNames(subjectCount);
String[] studentNames = new String[studentCount];
int[][] totalScore = new int[studentCount][subjectCount];



getStudentData(studentNames, totalScore , subjectNames);
    }

public static int getNumber(String type){
System.out.print("Enter number of " );


return Integer.parseInt(scanner.nextLine());

}



public static String[] getSubjectNames(int count){

String[] subjects = new String[count];

for (int index = 0; index < count; index++){

System.out.print("Enter name of subject " + (index + 1));
	subjects[index] = scanner.nextLine();
}

return subjects;

	}

public static void getStudentData(String[] studentNames, int[][] scores, String[] subjectNames){

for (int count = 0; count < studentNames.length; count++){
System.out.print("Enter name of student " + (count + 1));
studentNames[count] = scanner.nextLine();

for (int counter = 0; counter < subjectNames.length; counter++){
System.out.print("Enter score for " + subjectNames[counter]);

scores[count][counter] = Integer.parseInt(scanner.nextLine());

	}
}


	System.out.println("\n=== MY STUDENTS SCORE SHEET ===\n");
}








}










