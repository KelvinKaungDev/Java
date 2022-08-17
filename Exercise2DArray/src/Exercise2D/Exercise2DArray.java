package Exercise2D;

public class Exercise2DArray {

	public static void main(String[] args) {
		int [][] a = {
				{23, 45, 78},
				{45, 67, 90},
				{23, 12, 90}
			};
		
		int [][] b = {
				{45, 67, 88},
				{12, 56, 12},
				{23, 56, 12}
		};
		
		int [][] multiply = multiply(a,b);
		int [][] addResult = add(a,b);
		printArray(addResult);
		printArray(multiply);
		
	}
	
	public static int[][] multiply(int [][] array1, int [][] array2)
	{
		int[][] result = new int[3][3];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j< 3; j++)
			{
				result [i][j] = 0;
				for(int k = 0; k < 3; k++)
				{
					result[i][j] += array1[i][k] * array2[k][j];
				}
			}
		}
		
		return result;
	}
	
	public static int[][] add(int[][] array1, int[][] array2)
	{
		int addResult[][] = new int[3][3];
		
		for(int i=0; i < array1.length; i++)
		{
			for(int y=0; y < array2.length; y++)
			{
				addResult[i][y] = array1[i][y] + array2[i][y];
			}
		}
		return addResult;
	}
	
	public static void printArray(int[][] array)
	{
		for(int i=0; i<array.length; i++)
		{
			for(int y=0; y<array.length; y++)
			{
				System.out.print(array[i][y] + " ");
			}
			System.out.println();
		}
	}

}
