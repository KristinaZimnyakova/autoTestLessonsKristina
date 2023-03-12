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
            System.out.println("������� �� �����");
        }
        try {
            NumberDividing.dividing(number);
        } catch (Multiplisity10Exception e) {
            System.out.println("����� ������ 10");
            e.printStackTrace();
        }
        catch (Multiplisity2Exception e1) {
            System.out.println("����� ������ 2");
            e1.printStackTrace();
        }
        finally {
            System.out.println(Math.pow(Integer.parseInt(number), 2));
        }
    }
}
