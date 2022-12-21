import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.print("Введите целое число:");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        System.out.println("Задание 2");
        System.out.print("Введите имя:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет " + name);
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println("Задание 3");
        System.out.print("Задайте количестов элементов массива:");
        Random rnd = new Random();
        Scanner n = new Scanner(System.in);
        int length = n.nextInt();
        int[] array = new int[length];

        for (int i = 0; i<array.length; i++){
            array[i] =rnd.nextInt();
        }
        System.out.println("Массив входных данных из " +length+ " элементов: "+ Arrays.toString(array));
        System.out.println("Числа кратные 3 из массива: ");
        for (int i = 0; i<array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(
                        array[i]);
            }
        }

    }
}