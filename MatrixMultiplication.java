
public class MatrixMultiplication {
	public static void main(String[] args) {
		int row1=2;
		int column1=3;
		int row2=3;
		int column2=2;
		int [][] matrix1= {{2,4,6},{8,10,12}};
		int [][] matrix2= {{1,3},{5,7},{9,11}};
		int [][] resultMatrix=new int[row1][column2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column2;j++) {
				for(int k=0;k<column1;k++) {
					resultMatrix[i][j]+= matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column2;j++) {
				System.out.print(resultMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
