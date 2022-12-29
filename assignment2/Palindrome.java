package week1.day2.assignment2;

public class Palindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			int num =34343;
			int temp = 0, r;
			int a = num;
			for(;num != 0; num = num/10)
			{
				r = num%10;
				temp = (temp*10)+r;
			}
			if(a==temp) 
			{
				System.out.println(a+" is a palindrome number");
			}
			else
			{
				System.out.println(a+" is not a palindrome number");
			}
			
		}

	}