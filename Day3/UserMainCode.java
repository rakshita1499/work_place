package Day3;
import java.util.Scanner;
public class UserMainCode {
	
	static int validateNumber(String s1)
	{
		if(s1.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")){
			return 1;
			}else 
				return-1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String n1=in.nextLine();
		int c=UserMainCode.validateNumber(n1);
		if(c==1)System.out.println("VALID");
		else System.out.println("INVALID");

	}

}
