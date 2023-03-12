package task1;

public class NumberDividing {

    public static void dividing(String number) throws Multiplisity2Exception, Is0Exception {
        if (Integer.parseInt(number) == 0) {
            throw new Is0Exception();
        }
        else if (Integer.parseInt(number) % 10 == 0) {
            throw new Multiplisity10Exception();
        }
        else if (Integer.parseInt(number) % 2 == 0) {
            throw new Multiplisity2Exception();
        }
    }

}
