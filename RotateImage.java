class RotateImage {
    public void reverseRow(int[][] matrix, int i, int n) {
        for(int j=0;j<(n/2);j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1] = temp;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++) {
            reverseRow(matrix, i, n);
        }
    }
    public static void main(String[] args) {
        RotateImage obj = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        obj.rotate(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}