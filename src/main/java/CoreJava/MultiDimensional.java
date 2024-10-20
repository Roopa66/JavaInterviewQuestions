package CoreJava;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// multidimensional array
		// for array u can use 1 for loop
		// for multidimensional array u can use 2 for loops for row and column

		int a[][] = new int[2][3];
		a[0][0] = 7;
		a[0][1] = 5;
		a[0][2] = 3;
		a[1][0] = 1;
		a[1][1] = -1;
		a[1][2] = -3;

		for (int i = 0; i < 2; i++)//row
		{
			for (int j = 0; j < 3; j++)//column
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
