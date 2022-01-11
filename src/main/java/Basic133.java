import java.util.Arrays;

public class Basic133 {
    public static void main(String[] args) {
        int[][] matrix = {  {7, 4, 2},
                            {0, 5, 6},
                            {3, 1, 2}};

        int suma = 0;

        for(int i = 0; i < matrix.length; i++){
            suma += matrix[i][0];
        }
        for(int j = 0; j < matrix[2].length; j++){
            suma+= matrix[2][j];
        }
        System.out.println("Array : " + Arrays.deepToString(matrix));
        System.out.println("Suma : " + suma);
    }
}
