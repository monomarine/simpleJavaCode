import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("enter array size:");

       Scanner input = new Scanner(System.in);
       int arrayRows = input.nextInt();
       int arrayColumns = input.nextInt();

       int[][] numberArray = GenerationArray(arrayRows,arrayColumns);
       System.out.println(numberArray[5][5]);
    }

    public static int[][] GenerationArray(int a, int b){
        Random random = new Random();
        int[][] array = new int[a][b];

        for (int i = 0; i<a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }

    //метод для вывода двумерного массива на консоль
    //вывод с табами для равномерного расстояния
    //на вход принимает массив
}

