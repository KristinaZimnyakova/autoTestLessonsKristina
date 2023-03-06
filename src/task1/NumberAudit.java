package task1;

import java.util.Scanner;

public class NumberAudit {

    public static void numberAudit () throws Is0Exception {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        try {
            Integer.parseInt(number);
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Введено не число");
        }
        if (Integer.parseInt(number) == 0) {
            throw new Is0Exception();
        }
        else if (Integer.parseInt(number) % 10 == 0) {
            try {
                throw new Multiplisity10Exception();
            } catch (Multiplisity10Exception e) {
                System.out.println("Число кратно 10");
                e.printStackTrace();
            }
            finally {
                System.out.println(Math.pow(Integer.parseInt(number), 2));
            }
        }
        else if (Integer.parseInt(number) % 2 == 0) {
            try {
                throw new Multiplisity2Exception();
            } catch (Multiplisity2Exception e) {
                System.out.println("Число кратно 2");
                e.printStackTrace();
            }
            finally {
                System.out.println(Math.pow(Integer.parseInt(number), 2));
            }
        }
        else {
            System.out.println(Math.pow(Integer.parseInt(number), 2));
        }



    }
}
