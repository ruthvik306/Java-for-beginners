import java.util.Scanner;

public class Palindrome {
	
	private String reverse(String a){
		int i;
		String rev = "";
		for(i=a.length()-1;i>=0;i--){
			try{
				rev = rev + a.charAt(i);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		return rev;
	}
	
	boolean isPalindrome(String a){
		String k = a.replaceAll("[,./?;:'!%\\s]","");
		if(k.equalsIgnoreCase(reverse(k)))
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		Scanner input = new Scanner(System.in);
		try{
			System.out.print("Enter a string to check if it is a Palindrome : ");
			String s = input.next();
			System.out.println(p.isPalindrome(s));
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			input.close();
		}
		

	}

}
