import java.util.*;
public class Details {
 
  public int BinaryToDecimal(int binaryNumber){
 
    int decimal = 0;
    int p = 0;
    while(true){
      if(binaryNumber == 0){
        break;
      } else {
          int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
       }
    }
    return decimal;
  }
 
  public static void main(String args[]){
    Details obj = new Details();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n+" to decimal is "+obj.BinaryToDecimal(n));
  }
}