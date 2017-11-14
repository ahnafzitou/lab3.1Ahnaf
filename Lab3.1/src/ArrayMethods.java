
public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] intArray = new int[]{4,2,3,2,3,5};/* */
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[] {4,6,5};
		printArray(intArray);
		System.out.println();
		printArray(removeDuplicates(intArray));
		System.out.println();
		printArray(productArray(arr1,arr2));
		System.out.println();
		printPascalTriangle(pascalTriangle(8));
	}
	/*removeDuplicates removes all the duplicate elements in a given array, list */
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
	/*porductArray takes two different arrays of equal length and returns a two-dimensional array containing the products of those arrays */
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
	/*pascalTriangle creates the world famous pascal triangle, with the length n which is given as a parameter */
	public static int[][] pascalTriangle(int n)
	{
		int[][] rows = new int [n][];
		for(int i = 0; i < n; i++)
		{
			rows[i] = new int [i + 1];
			for(int j = 0; j < i +1; j++)
			{
				if(j == 0 || j == i)
				{
					rows[i][j] = 1;
				}
				else
				{	
					rows[i][j] = rows[i -1][j -1] + rows[i -1][j];
				}	
			}
		}
		return rows;
	}
	/*printPascalTriangle this method prints the world famous Pascal triangle that we created in the method above */
	public static void printPascalTriangle(int [][] pTriangle)
	{
		for(int i = 0; i < pTriangle.length; i++)
		{
			for(int h = 0; h < pTriangle.length-i; h++)
			{
					System.out.print("   ");
			}
			for (int j = 0; j < pTriangle[i].length; j++)
			{
				System.out.print("[" + pTriangle[i][j] + "]   ");
			}
			System.out.println();
		}
	}
	/*copyArray copies an array(taken from a previous activity)*/
	public 	static int[] copyArray(int[] intArray)
	{
		int[] copy = new int[intArray.length];
		for(int i = 0; i < intArray.length; i++)
		{
			copy[i] = intArray[i];
		}
		return copy;
			
	}
	/*printArray prints an array(taken from a previous activity) */
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	/*overloaded printArray method for a two-dimensional array */
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
