import java.util.*;
public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a>0)
			System.out.println("Positive number");
		else if(a<0)
		System.out.println("Negative number");
		else
			System.out.println("Number is Zero");
	
    }
}
