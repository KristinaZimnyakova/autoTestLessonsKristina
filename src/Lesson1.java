import java.util.Scanner;

public class Lesson1 {
    public void task1a() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рублей");
        Double amountRub = scanner.nextDouble();
        System.out.println("Введите курс доллара");
        Double dollarExcangeRate = scanner.nextDouble();
        System.out.println(amountRub / dollarExcangeRate + " долларов");
    }

    public void task1c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество минут");
        Integer inputMin = scanner.nextInt();
        int hours = inputMin / 60;
        int min = inputMin % 60;
        System.out.println(hours + " часов " + min + " минут");
    }

    public void task1d() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + i + " значение");
            int arrayValue = scanner.nextInt();
            array[i] = arrayValue;
        }
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max) {
                max = array[j];
            }
        }
        System.out.println("Максимальное значение " + max);
    }
//не готово
    public void task1e() {
        String[] arrayTerem = new String[] {"мышка", "лягушка", "мишка"};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Кто-кто в теремочке живет?");
            String input = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                if (input.equalsIgnoreCase(arrayTerem[j])) {
                    System.out.println("Вы угадали");
                }
                else {
                    System.out.println("Вы не угадали"  );
                }
            }

        }




    }
}
