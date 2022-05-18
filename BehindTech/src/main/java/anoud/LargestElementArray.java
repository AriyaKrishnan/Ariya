package anoud;

public class LargestElementArray {
	public static void largeelement(int no_of_rows,int[][] arr) {
		int i =0;
		int max = 0;
		int[] result = new int[no_of_rows];
		while (i < no_of_rows) {
			for (int j =0;j < arr[i].length;j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					
				}
			}
			result[i] = max;
			max = 0;
			i++;
			
		}
		printArray(result);
		
	}
	private static void printArray(int[]result) {
		for (int i =0;i<result.length;i++) {
			System.out.println(result[i]);
			
		}
	}

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1,2,19,4},{5,6,71,8},{9,100,11,12},{13,149,15,16}};
		largeelement(4,arr);
		

	}

}
