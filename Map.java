/*
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String filePath = "data.txt";
        Map<String, String> dataMap = readDataFromFile(filePath);
        System.out.println("Исходные данные:");
        printMap(dataMap);
        
        // Модификация данных
        modifyData(dataMap);
        
        // Запись модифицированных данных обратно в файл
        writeDataToFile(filePath, dataMap);
        System.out.println("Модифицированные данные записаны в файл.");
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



/*Мы сначала считываем данные из файла в HashMap с помощью метода readDataFromFile.
Затем модифицируем значения в HashMap, заменяя "?" на другие значения в методе modifyData.
Наконец, записываем модифицированные данные обратно в файл с помощью метода writeDataToFile.
 */
  
/*
 * 
 */