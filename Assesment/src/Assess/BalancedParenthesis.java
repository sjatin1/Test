package Assess;
import java.util.Scanner;
public class BalancedParenthesis {
	public static void main(String[] args) {
		System.out.println("Enter the parenthesis to check if it is balanced or not");
		Scanner sc = new Scanner(System.in);
		String par = sc.next();
		int a=0;
		char y = par.charAt(0);
		if(y== ')' || y=='}' || y==']') {
			a=0;
		}
		for(int i=1; i<par.length(); i++) {
			char x = par.charAt(i);
			if(x == '(' || x=='{' || x=='[') {
				a++;
			}
			else if(x==')' || x=='}' || x==']') {
				a--;
			}
		}
		if(a==0) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}
}
