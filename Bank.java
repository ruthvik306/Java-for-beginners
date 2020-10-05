import java.util.Scanner;

public class Bank{
	String name, surname, address, lastop;
	long ph_no, balance=1000;
	void credit(int amt){
		balance-=amt;
		System.out.println("Credit fun");
	}
	void debit(int amt){
		balance+=amt;
	}
	public static void main(String args[]){
		Bank a = new Bank();
		Scanner input = new Scanner(System.in);
		int op,amt;
		System.out.print("Name = ");
		a.name = input.nextLine();
		System.out.print("surname = ");
		a.surname = input.nextLine();
		System.out.print("Address = ");
		a.address = input.nextLine();
		System.out.print("Phone number = ");
		a.ph_no = input.nextLong();

		boolean x=true;
		while(x){
			System.out.println("\n\nWhat operation do you want to perform : ");
			System.out.print("1.Credit\n2.Debit\n3.Exit\n\n--");
			op = input.nextInt();
			switch(op){
				case 1:
					System.out.print("Enter the amount : ");
					amt = input.nextInt();
					a.credit(amt);
					a.lastop = "Credit";
					break;
				case 2:
					System.out.print("Enter the amount : ");
					amt = input.nextInt();
					a.debit(amt);
					a.lastop = "Debit";
					break;
				case 3:
					x=false;
					break;
				default:
					System.out.println("Invalid input");
			}

		}

		System.out.println("\n\nName = "+a.name+"\nSurname = "+a.surname+"\nBalance = "+a.balance+"\nLast op = "+a.lastop);
	}
}