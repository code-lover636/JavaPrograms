import java.util.Scanner;

class MatrixMultiplication{
	public static void main(String args[]){
		// Reading row and column
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row and column of matrix1: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.print("Enter row and column of matrix2: ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		//Check whether multiplication is possible
		if(n!=p){
			System.out.println("Matrices cannot be multiplied.");
			return;
		}
		
		//Creating and reading matrix
		int mat1[][] = new int[m][n], mat2[][] = new int[p][q];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.printf("Enter number matrix1[%d][%d]: ", i+1, j+1);
				mat1[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<p; i++){
			for(int j=0; j<q; j++){
				System.out.printf("Enter number matrix2[%d][%d]: ", i+1, j+1);
				mat2[i][j] = sc.nextInt();
			}
		}
		
		//Computing product
		int matrix[][] = new int[m][q];
		for(int i=0; i<m; i++){
			for(int j=0; j<q; j++){
				for(int k=0; k<p; k++){
					matrix[i][j] += mat1[i][k]*mat2[k][j];
				}
			}
		}
		
		// Printing resultant matrix
		for(int i=0; i<m; i++){
			for(int j=0; j<q; j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
