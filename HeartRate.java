import java.util.Scanner;

public class HeartRate{
	String name, surname;
	int birthYear, currentYear = 2020;
	int mhr;
	float mintar,maxtar;
	int age(){
		return (currentYear-birthYear);
	}
	void rateCal(){
		mhr=(220-age());
		mintar=(float)0.5*(float)mhr;
		maxtar=(float)0.85*(float)mhr;
	}

	public static void main(String[] args) {
		HeartRate a = new HeartRate();
		Scanner input = new Scanner(System.in);
		System.out.print("Name = ");
		a.name = input.nextLine();
		System.out.print("Surname = ");
		a.surname = input.nextLine();
		System.out.print("birthYear = ");
		a.birthYear = input.nextInt();
		a.rateCal();
		System.out.println("\n\nDetails : ");
		System.out.println("Name = "+a.name+"\nSurname = "+a.surname+"\nDOB = "+a.birthYear);
		System.out.println("Age = "+a.age()+"\nMax heart rate = "+a.mhr+"\nMin target HR = "+a.mintar+"\nMax target HR = "+a.maxtar);
	}
}