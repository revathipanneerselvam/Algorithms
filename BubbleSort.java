package SortExamples;

public class BubbleSort {
public static void main(String args[])
{
	int[] input_array={10,7,3,15,19};
	bubble_sort(input_array);

}

private static void bubble_sort(int[] input_array) {
	// TODO Auto-generated method stub
	int array_len = input_array.length;
	int k;
	for(int i=array_len;i>=0;i--)
	{
		for(int j=0;j<array_len-1;j++)
		{
			k = j+1;
			if(input_array[j]>input_array[k])
			{
				swapElements(j,k,input_array);
			}
		}
		printElements(input_array);
	}
}

private static void printElements(int[] input_array) {
	// TODO Auto-generated method stub
	for(int i=0;i< input_array.length;i++)
	{
		System.out.print(input_array[i]+" ");
	}
	System.out.println("\n");
}

private static void swapElements(int j, int k, int[] input_array) {
	// TODO Auto-generated method stub
	int temp;
	temp = input_array[j];
	input_array[j] = input_array[k];
	input_array[k] = temp;
}



}