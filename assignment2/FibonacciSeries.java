package week1.day2.assignment2;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			int a = 8, firstnumber = 0, secondnumber = 1, num;
			
			System.out.println(firstnumber+" "+secondnumber);
			
			for(int i =2; i < a; i++)
			{
				num = firstnumber+secondnumber;
				System.out.println(num);
				firstnumber = secondnumber;
				secondnumber = num;
			}
		}

	}



