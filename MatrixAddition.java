
public class MatrixAddition {

	public static void main(String[] args) {
		int rows=3;
		int columns=3;
		int [][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
		int [][] matrix2= {{9,8,7},{6,5,4},{3,2,1}};
		int [][] resultMatrix=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int k=0;k<rows;k++) {
			for(int l=0;l<columns;l++) {
				System.out.print(resultMatrix[k][l]+" ");
			}
			System.out.println();
		}
	}

}
