package SortExamples;

public class SelectionSort {
	public static void main(String args[])
	{
		int[] array = {8,5,12,-9,2};
		int[] array_new = selection_sort(array);
		for (int i = 0 ; i < array_new.length -1 ; i++)
		{
			System.out.print(array_new[i] + " ");
		}
	}

	private static int[] selection_sort(int[] array) {
		// TODO Auto-generated method stub
		int arr_len = array.length;
		for(int i=0 ; i < arr_len - 1; i++)
		{
			int index = i;
			for(int j = i+1 ; j < arr_len ; j++)
			{
				if (array[j]<array[index])
					index = j;
			}	
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		
		}
		return array;
	}

}
