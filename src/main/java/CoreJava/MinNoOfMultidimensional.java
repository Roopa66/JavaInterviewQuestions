package CoreJava;

public class MinNoOfMultidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];
		// or

		int abc[][] = { { 1, 2, 3 }, { 4, 5, -1 }, { 7, 8, 9 } };
		int min = abc[0][0];
int col=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					col=i;

				}
			}
		}
		int max=0;
		for(int k=1;k<3;k++) {
			if(abc[col][k] > max) {
				max=abc[col][k];
			}
		}
		System.out.println(min+" "+max);

		// identify the minimum number and the same column find the max number
		
		
	}

}
