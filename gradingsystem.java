import java.util.Scanner;

public class gradingsystem {

	public static int roundup(Float a) {
		int d = (int) Math.ceil(a);
		return d;
	}

	public static String getComments(Float a) {
		String remarks;


		if ( gradingsystem.roundup(a) >= 75 ) {
			remarks = "Pasado ka tsong!";
		} else {
			remarks ="BOBO BAGSAK!HAHA";
		}

		return remarks;
	} 

	public static String getEquivalent(Float a) {

		String equivalent;
		int b = (int) gradingsystem.roundup(a);
		equivalent = "";
		if (b <= 74 )
			equivalent = "F";

		if ( b >= 80 ) 
			equivalent = "C-";

		if ( b >= 85 )
			equivalent = "C";

		if ( b >= 87 ) 
			equivalent = "C+";

		if ( b >= 90 ) 
			equivalent = "A-";

		if ( b >= 93 ) 
			equivalent = "A";

		if ( b > 95 ) 
			equivalent = "AA";

		if ( b > 98 ) 
			equivalent = "AAA";

		if ( b == 100 )
			equivalent = "BEYOND GODLIKE!";
		return equivalent;
	}

	public static void main(String[] args) {

		Scanner inputs = new Scanner(System.in);
		String studentID, studentNAME, remarks;
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



		//System.out.print(average + " " + remarks + " " + equivalent);
		

		for (int i=1; i < 15; i++) {
			System.out.print("-");
		}
		System.out.println("-");
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + studentNAME);
		System.out.println("Average: " + gradingsystem.roundup(average));
		System.out.println("Rank: " + gradingsystem.getEquivalent(average));
		System.out.println("Professor's comment: " + gradingsystem.getComments(average));
		

	}
}