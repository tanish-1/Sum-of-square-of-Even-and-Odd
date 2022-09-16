# Sum-of-square-of-Even-and-Odd 
#i.e. 2^2 + 4^2 +  6^2 + _______ + 20^2
#i.e. 1^2 + 3^2 + 5^2 + _______ + 23^2
import java.util.Scanner;
public class Sum{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int s = 0;
    int n = input.nextInt();
    s = (n*(n+1)*(n+n+1))/6;
		System.out.println(s);
	}
}
