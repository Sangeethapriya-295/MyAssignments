package week1.day2.assignment2;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
			
			int[] array = {1,2,3,4,7,6,8};
			int a = 8;
			int sum = a*(a+1)/2;
			int sum1 = 0;
			for(int i = 0; i< array.length; i++) {
				sum1 = sum1+array[i];
				
			}
			
			int num = sum-sum1;
			System.out.println(num+" is the missing element in an array.");
			
			
		}

	}

	
