
public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] intArray = new int[]{4,2,3,2,3,5};
		/*for(int i = 0; i < intArray.length; i++)
		{
			intArray[i] = (int)(Math.random() * 10);
		}*/
		printArray(intArray);
		printArray(removeDuplicates(intArray));
	}
	public static int[] removeDuplicates(int[] list)
	{
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
				temp[i] = copy[i];
			}
		}
		return temp;
	}
	public static int[][] productArray(int[] arr1,int[] arr2)
	{
		return null; 
	}
	public static int[][] pascalTriangle(int n)
	{
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
}
