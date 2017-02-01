package SortExamples;

public class InsertionSort {
	public static void main(String args[])
	{
		int[] input_array = {9,-5,10,7,11};
		int[] result = insertion_sort(input_array);
		for (int i = 0 ; i < result.length; i++)
		{
			System.out.print(result[i] + " ");
		}

	}

	private static int[] insertion_sort(int[] input_array) {
		// TODO Auto-generated method stub
		int arr_len = input_array.length;
		for(int i = 1 ; i< arr_len ; i++)
		{
			for(int j = i;j > 0; j--)
			{
				if (input_array [j] < input_array[j-1])
				{
					int temp = input_array[j];
					input_array[j] = input_array[j-1];
					input_array[j-1] = temp;
				}
			}
		}
		return input_array;
	}

}
