import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создаем объекты для чтения и записи файлов
        FileInputStream inputStream = new FileInputStream("input.txt");
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        // Читаем первую строку
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String firstLine = reader.readLine();

        // Читаем числа
        double numbers[] = new double[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Double.parseDouble(reader.readLine());
            if (numbers[i] < 0) {
                continue;
            }
        }

        // Записываем вторую строку и положительные числа
        outputStream.write(secondLine.getBytes());
        for (double number : numbers) {
            if (number > 0) {
                outputStream.write(Double.toString(number).getBytes());
            }
        }

        // Закрываем потоки
        reader.close();
        inputStream.close();
        outputStream.close();
    }
}