import java.util.Scanner;

public class gradingsystem {
	public static void main(String[] args) {

		Scanner inputs = new Scanner(System.in);
		String studentID, studentNAME, remarks, equivalent;
		Float firstSEM, secondSEM, thirdSEM, average;
		System.out.print("Student ID: ");
		studentID = inputs.nextLine();

		System.out.print("Studen Name: ");
		studentNAME = inputs.nextLine();

		System.out.print("First semester grade: ");
		firstSEM = inputs.nextFloat();

		System.out.print("Second semester grade: ");
		secondSEM = inputs.nextFloat();

		System.out.print("Third semester grade: ");
		thirdSEM = inputs.nextFloat();

		average = (firstSEM + secondSEM + thirdSEM) / 3;

		remarks = "";
		equivalent = "";
		
		if ( average >= 75 ) {
			remarks = "Pasado ka tsong!";
			equivalent = "D";
		} else {
			remarks ="BOBO BAGSAK!HAHA";
		}



		if (average <= 74 )
			equivalent = "F";


		if ( average >= 80 ) 
			equivalent = "C-";

		if ( average >= 85 )
			equivalent = "C";

		if ( average >= 87 ) 
			equivalent = "C+";

		if ( average >= 90 ) 
			equivalent = "A-";

		if ( average >= 93 ) 
			equivalent = "A";

		if ( average > 95 ) 
			equivalent = "AA";

		if ( average > 98 ) 
			equivalent = "AAA";

		if ( average == 100 )
			equivalent = "BEYOND GODLIKE!";

		//System.out.print(average + " " + remarks + " " + equivalent);
		int d = (int) Math.ceil(average);

		for (int i=1; i < 15; i++) {
			System.out.print("-");
		}
		System.out.println("-");
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + studentNAME);
		System.out.println("Average: " + d);
		System.out.println("Rank: " + equivalent);
		System.out.println("Professor's comment: " + remarks);

	}
}