package task1;

public class Task1_3 {
	public static int[][] multiply(int[][] a, int[][] b) {
	    int rowsA = a.length;
	    int colsA = a[0].length;
	    int colsB = b[0].length;
	    int[][] result = new int[rowsA][colsB];
	    for (int i = 0; i < rowsA; i++) {
	        for (int j = 0; j < colsB; j++) {
	            for (int k = 0; k < colsA; k++) {
	                result[i][j] += a[i][k] * b[k][j];
	            }
	        }
	    }
	    return result;
	}
	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][] ={{ 1, 3, 4 }, 
					{ 2, 4, 3 }, 
					{ 3, 4, 5 } };
		
		int b[][] ={{ 1, 3, 4 }, 
					{ 2, 4, 3 }, 
					{ 1, 2, 4 } };

		int c[][] = multiply(a, b);
		display(c);
		
	}
}
