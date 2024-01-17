import java.io.*;

public class Someclass {
    public static void main(String[] args) {
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[2]; // Выход за границы массива, ArrayIndexOutOfBoundsException
            test();
            int a = 1 / 0; // Деление на ноль, ArithmeticException
            InputStream inputStream = new FileInputStream("sdafgdsaf"); // Файл не найден, FileNotFoundException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (StackOverflowError error) {
            System.out.println("asdfasdfdsa");
        } finally {
            System.out.println("Я всё равно выполнился");
        }
        System.out.println("Я жив!");
    }

    public static void test() {
        try {
            File file = new File("1");
            file.createNewFile();
            FileReader reader = new FileReader(file);
            reader.read();
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*Добавлены отдельные блоки catch для каждого исключения, чтобы обработать их по отдельности.
  Метод test() больше не объявляет throws IOException, так как исключение обрабатывается внутри метода.
  Убрано пробрасывание исключения IOException из метода test(), так как оно уже обрабатывается внутри метода.
 * 
 */
 
 /* 

//В этом примере я объединил все три фрагмента кода в один класс Main. Я также объединил оба метода main в один, так как в Java может быть только один метод main в каждом классе.

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = scanner.nextInt();
            if (index < 0 || index >= arr.length) {
                System.out.println("Указан индекс за пределами массива");
            } else {
                arr[index] = 1;
            }

            String filePath = "data.txt";
            Map<String, String> dataMap = readDataFromFile(filePath);
            System.out.println("Исходные данные:");
            printMap(dataMap);

            // Модификация данных
            modifyData(dataMap);

            // Запись модифицированных данных обратно в файл
            writeDataToFile(filePath, dataMap);
            System.out.println("Модифицированные данные записаны в файл.");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (StackOverflowError error) {
            System.out.println("asdfasdfdsa");
        } finally {
            System.out.println("Я всё равно выполнился");
        }
        System.out.println("Я жив!");
    }

    private static Map<String, String> readDataFromFile(String filePath) {
        Map<String, String> dataMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    dataMap.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataMap;
    }

    private static void modifyData(Map<String, String> dataMap) {
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            String value = entry.getValue();
            if (value.equals("?")) {
                // Модификация значения, если оно равно "?"
                // В данном примере заменим "?" на "10"
                entry.setValue("10");
            }
        }
    }

    private static void writeDataToFile(String filePath, Map<String, String> dataMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
*
*/

 
 


 



  