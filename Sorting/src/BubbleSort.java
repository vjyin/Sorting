
public class BubbleSort {
	
	public static void main(String[] args) 
	{		
		int a[] = {1,3,2,10,18,4,3};
		a = bubbleSort(a);
		for (int i:a) 
		{
			System.out.print(i + " ");
		}
	}
	
	public static int[] bubbleSort(int[] input) 
	{
		for (int i=0;i<input.length;i++) 
		{
			for (int j = i; j<input.length;j++) 
			{
					if (input[i] > input[j])
					{
						//swap
						int temp = input[i];
						input[i]=input[j];
						input[j] =temp;
					}
			}
		}
		return input;
	}
}
