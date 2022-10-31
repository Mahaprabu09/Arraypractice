package Arrayspractice;

/*Sorting an array
Compare the first two elements of the array
If the first element is greater than the second swap them.
Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
Repeat this till the end of the array.
After sorting an array print the 1st element from the end of the array.
*/
public class Findbigarray {
	public static void main(String[]args)
	{
		int[] arr={223,445,43,444,321,353,563};
		int temp,size=arr.length;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println("Largest number in array is :"+arr[size-1]);
	}
}
