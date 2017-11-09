
public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] intArray = new int[]{4,2,3,2,3,5};
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[] {4,6,5};
		/*for(int i = 0; i < intArray.length; i++)
		{
			intArray[i] = (int)(Math.random() * 10);
		}*/
		printArray(intArray);
		printArray(removeDuplicates(intArray));
		printArray(productArray(arr1,arr2));

	}
	public static int[] removeDuplicates(int[] list)
	{
		int inc = 0;
		int[] copy = copyArray(list);
		int[] temp = new int[copy.length];
		
		for(int i = 0; i < copy.length; i++)
		{
			
			boolean isDupe = false;
			for (int j = i; j< copy.length; j++)
			{
				if(copy[i]==copy[j]&&j!=i)
				{
					isDupe = true;
				}
			}
			if(!isDupe)
			{
				temp[inc] = copy[i];
				inc++;
			}
		}
		int[] temp2 = new int[inc];
		for(int h = 0; h < inc; h++)
		{
			temp2[h] = temp[h];
		}
		return temp2;
	}
	public static int[][] productArray(int[] arr1,int[] arr2)
	{
		int[][]product = new int[arr1.length][arr2.length];
		for (int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length;j++)
			{
				product[i][j] = arr1[i]*arr2[j];
			}
		}
		return product; 
	}
	public static int[][] pascalTriangle(int n)
	{
		int[][] pascArr = new int[n][n];
		for (int i = 0; i < n; i++)
		{
			int[] tempArr = new int[i];
			pascArr[i] = tempArr;
		}
		return null;
	}
	public static void printPascalTriangle(int [][] pTriangle)
	{
		
	}
	public 	static int[] copyArray(int[] intArray)
	{
		int[] copy = new int[intArray.length];
		for(int i = 0; i < intArray.length; i++)
		{
			copy[i] = intArray[i];
		}
		return copy;
			
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	public static void printArray(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
	}
}
