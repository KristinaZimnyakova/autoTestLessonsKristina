package task1;

public class NumberDividing {

    public static void dividing10(String number) throws Multiplisity10Exception {
        if (Integer.parseInt(number) % 10 != 0) {
        }
        else {
            throw new Multiplisity10Exception();
        }
    }

    public static void dividing2(String number) throws Multiplisity2Exception {
        if (Integer.parseInt(number) % 2 != 0) {
        }
        else {
            throw new Multiplisity2Exception();
        }
    }
}
