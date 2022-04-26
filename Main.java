package Day3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int remindar=n%10;
			if(remindar%2!=0) {
				sum=sum+remindar;
			}
			n=n/10;
		}
		if(sum%2==0) {
			System.out.println("sum of  digits is even");
		}else {
			System.out.println("sum of digits is odd");
		}

	}

}
