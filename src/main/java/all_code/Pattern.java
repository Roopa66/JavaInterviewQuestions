package all_code;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for( int i=1;i<=n;i++) {
			for( int j =n;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
		// logic is k>=m
		for( int m=n;m>=1;m--) {
			for(int k=1;k<=n;k++) {
				if(k>=m) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
