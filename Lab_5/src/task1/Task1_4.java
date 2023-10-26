package task1;

public class Task1_4 {
	public static int[][] transpose(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		int[][] result = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[j][i] = a[i][j];
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
		

		int c[][] = transpose(a);
		display(c);
		
	}
}
