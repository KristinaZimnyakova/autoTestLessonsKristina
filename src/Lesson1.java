import java.util.Scanner;

public class Lesson1 {
    public void task1a() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рублей");
        Double amountRub = scanner.nextDouble();
        System.out.println("Введите курс доллара");
        Double dollarExcangeRate = scanner.nextDouble();
        System.out.println(amountRub/dollarExcangeRate + " долларов");
    }
    public void task1c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество минут");
        Integer inputMin = scanner.nextInt();
        int hours = inputMin/60;
        int min = inputMin%60;
        System.out.println(hours + " часов " + min + " минут");
    }

}
