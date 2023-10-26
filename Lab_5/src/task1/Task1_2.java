package task1;

public class Task1_2 {
	// subtract 2 matrices
	public static int[][] subtract(int[][] a, int[][] b) {
	    int rows = a.length;
	    int cols = a[0].length;
	    int[][] result = new int[rows][cols];
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            result[i][j] = a[i][j] - b[i][j];
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

		int c[][] = subtract(a, b);
		display(c);
		
	}
}
