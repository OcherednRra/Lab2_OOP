import java.util.Scanner;

public class Lab2 {

    public static void print(String line){
        System.out.print(line);
    }

    public static void matrixBuilder(int[][] matrix, int factor){
        for (int i = 0; i < matrix.length; i++){
            print("\t");
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] *= factor;
                System.out.printf("%4d ", matrix[i][j]);
            }
            print("\n");
        }
        print("\n");
    }

    public static void main(String[] args){
	/*
	1515 % 5 = 0  -----> C = a*B, a - const
	1515 % 7 = 3  -----> matrix type int
	1515 % 11 = 8 -----> Знайти середнє значення елементів кожного рядка матриці
	*/

        int[][] matrix = {{3, 2, 1, 5},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};

        print("Введена матриця:\n");
        matrixBuilder(matrix, 1);

        Scanner input = new Scanner(System.in);
        print("a = ");
        final int a = input.nextInt();

        print("Матриця після множення на константу а:\n");
        matrixBuilder(matrix, a);

        for (int i = 0; i < matrix.length; i++){
            float average = 0;
            for (int j = 0; j < matrix[i].length; j++){
                average += matrix[i][j];
            }
            average = average / matrix[i].length;
            System.out.printf("Середнє значення рядка %d: %.2f%n", i, average);
        }
    }
}
