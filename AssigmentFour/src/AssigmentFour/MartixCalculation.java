package AssigmentFour;

public class MartixCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,1,1},{2,2,2},{3,3,3}}; 
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        
        int[][] addResult = add(a, b);
        int[][] multiResult = multiply(a,b);
        
        print2DArray(addResult);
        print2DArray(multiResult);
	}
	
	public static void print2DArray(int[][] matrix) {
		for (int i=0; i < matrix.length; i++) {
			for(int y=0; y< matrix[i].length; y++) {
				System.out.print(matrix[i][y]);
			}
			System.out.println();
		}
	}
	
	public static int[][] add(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[matrixA.length][matrixA[0].length];
		for (int i=0; i < matrixA.length; i++) {
			for(int y=0; y< matrixA[i].length; y++) {
				matrixC[i][y] = matrixA[i][y] + matrixB[i][y];
			}
		}
		return matrixC;
	}
	
	public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
		int[][] matrixC = new int[matrixA.length][matrixA[0].length];
		for (int i=0; i < matrixA.length; i++) {
			for(int y=0; y< matrixA[i].length; y++) {
				for(int z=0; z< matrixB[y].length; z++) {
					matrixC[i][y] += matrixA[i][y] * matrixB[z][i];
				}
			}
		}
		return matrixC;
	}

}
