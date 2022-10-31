package Arrayspractice;
import java.util.Arrays;
import java.util.Scanner;
public class Arraystorereturn {
	
	//SORT ARRAY ELEMENTS WITH CONTROL STATEMENTS
	public static void main(String[]args)
	{
		
		
		int[] array1={23,12,53,21,78,65,2,33};
		
		
		//Sort array using keyword
		
/*		
		Arrays.sort(array1);
		
		System.out.println(Arrays.toString(array1));
		
		*/
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]>array1[j])
				{
					int temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
				}
			}
			System.out.println("Sorted given array is :"+array1[i]);
		}
		
		
					
				}

		}
		
		
		
		
		
/*		int[] userarray=getuserarray(5);
		
		for(int i=0;i<userarray.length;i++)
		{
			System.out.println("My element is :"+userarray[i]);
		}
		
		
		int sumofuser=userSum(userarray);
		System.out.println(sumofuser);
/*		for(int i=0;i<userarray.length;i++)
		{
			sum+=userarray[i];
		}
		System.out.println("Sum is :"+sum);
		*/
	
/*	
	public static int[] getuserarray(int num)
	{
		System.out.println("Enter "+num+" Values");
		Scanner sc=new Scanner(System.in);
		int[] uservalues=new int[num];
	
		for(int i=0;i<uservalues.length;i++)
		{
			uservalues[i]=sc.nextInt();
		}
		return uservalues;
	}
	public static int userSum(int[] num1)
	{
		int sum=0;
		
		for(int i=0;i<num1.length;i++)
		{
			sum+=num1[i];
		}
		return sum;
	}
	*/


