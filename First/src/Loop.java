import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number to print table");
		int num,table,i;
		num = obj.nextInt();
		
		
		
		for(i=1;i<=10;i++)
		{
			table=num*i;
			System.out.println(num +"*" + i +"="+table);
		}

	}

}
