import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,count,total=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		num=s.nextInt();
		for(count=1;count<=num;count++)
		{
			total=total+count;
		}
		System.out.println("sum of "+num+" natural numbers"+total);
	}
}
