
public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            try {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            } catch (NumberFormatException e) {
                // Обработка "битых" значений: заменяем их на нули
                System.err.println("Ошибка преобразования в целое число: " + arr[i][j]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Обработка выхода за границы массива
                System.err.println("Выход за границы массива: i=" + i + ", j=" + j);
            }
        }
    }
    return sum;
}
/*Для обработки возможных исключительных ситуаций в этом коде можно использовать блок try-catch для перехвата и обработки ошибок преобразования строки в целое число и индексации массива. 
 Также можно добавить проверку на "битые" значения в исходном массиве и заменить их на нули. 
 Внутренний цикл for теперь использует arr[i].length вместо фиксированного значения 5, чтобы обеспечить корректное перебор всех элементов вложенных массивов.
 Добавлен блок try-catch для перехвата NumberFormatException, который может возникнуть при попытке преобразования строки в число.
 Добавлен блок try-catch для перехвата ArrayIndexOutOfBoundsException, который может возникнуть при выходе за границы массива.
 Добавлено сообщение об ошибке в случае обнаружения "битых" значений в массиве.
 Теперь метод sum2d будет более устойчив к исключительным ситуациям и сможет обрабатывать "битые" значения в исходном массиве.
 * 
 *  
 *   
 */


 //Общий код двух программ
 


/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] arr = new int[2][3]; // Пример двумерного массива
            System.out.println("Укажите индекс строки массива: ");
            int row = scanner.nextInt();
            System.out.println("Укажите индекс столбца массива: ");
            int col = scanner.nextInt();
            if (row < 0 || row >= arr.length || col < 0 || col >= arr[row].length) {
                System.out.println("Указаны индексы за пределами массива");
            } else {
                arr[row][col] = 1;
            }
        }
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (NumberFormatException e) {
                    // Обработка "битых" значений: заменяем их на нули
                    System.err.println("Ошибка преобразования в целое число: " + arr[i][j]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Обработка выхода за границы массива
                    System.err.println("Выход за границы массива: i=" + i + ", j=" + j);
                }
            }
        }
        return sum;
    }
}

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */