package guvi;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
n=s.nextInt();
for(int i=0;i<=n;i++){
	sum+=i;
}
System.out.println(sum);
	}

}
