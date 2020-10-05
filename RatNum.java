import java.util.Scanner;

public class RatNum{
	public static void main(String[] args) {
		RationalNumber n1 = new RationalNumber();
		RationalNumber n2 = new	RationalNumber();
		n1.setp(25);
		n1.setq(10);
		n2.setp(5);
		n2.setq(15);
		n1.numberAsFraction();
		n2.numberAsFraction();
		RationalNumber a = n1.add(n1,n2);
		a.numberAsFraction();
		a = n1.mul(n1,n2);
		a.numberAsFraction();
		System.out.println(n1.numberAsDouble());
	}
}

class RationalNumber{
	int p,q;
	void setp(int p){
		this.p = p;
	}
	void setq(int q){
		if(q<=0){
			System.out.println("Denominator must be positive");
		}
		else{
			this.q = q;
		}
	}
	private int gcd(int n1, int n2){
		int g = 1, i;
		for(i=1;i<=n1 && i<=n2;i++){
			if(n1%i==0 && n2%i==0)
				g = i;
		}
		return g;
	}
	RationalNumber add(RationalNumber a, RationalNumber b){
		RationalNumber n = new RationalNumber();
		int den = a.q*b.q;
		int num = (a.p*b.q) + (b.p*a.q);
		n.p = num/gcd(num,den);
		n.q = den/gcd(num,den);
		return n;
	}
	RationalNumber mul(RationalNumber a, RationalNumber b){
		RationalNumber n = new RationalNumber();
		int den = a.q*b.q;
		int num = a.p*b.p;
		n.p = num/gcd(num,den);
		n.q = den/gcd(num,den);
		return n;
	}
	Double numberAsDouble(){
		return (double)p/(double)q;
	}
	void numberAsFraction(){
		System.out.println("Number = "+p/gcd(p,q)+"/"+q/gcd(p,q));
	}
}