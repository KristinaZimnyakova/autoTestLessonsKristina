import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello, world");
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
