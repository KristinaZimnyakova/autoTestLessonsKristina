public class Lesson1task1b {

    static void task1b(String input) {
        String one = " * \n" + "** \n" + " * \n" + " * \n" + " * \n" + " * \n" + "***";
        String two = " *** \n" + "*   * \n" + "*  * \n" + "  * \n" + " * \n" + "* \n" + "***** \n";
        String three = "**** \n" + "   * \n" + "   * \n" + " *** \n" + "   * \n" + "   * \n" + "**** \n";
        String four = "   * \n" + "  ** \n" + " * * \n" + "*  * \n" + "****** \n" + "   * \n" + "   * \n";
        String five = "**** \n" + "* \n" + "* \n" + "**** \n" + "   * \n" + "   * \n" + "**** \n";
        String six = "**** \n" + "* \n" + "* \n" + "**** \n" + "*  * \n" + "*  * \n" + "**** \n";
        String seven = "***** \n" + "    * \n" + "   * \n" + "  * \n" + " * \n" + "* \n" + "* \n";
        String eight = " *** \n" + "*   * \n" + "*   * \n" + " *** \n" + "*   * \n" + "*   * \n" + " *** \n";
        String nine = "**** \n" + "*   * \n" + "*   * \n" + "**** \n" + "    * /n" + "    * \n" + "    * \n";
        String zero = "**** \n" + "*  * \n" + "*  * \n" + "*  * \n" + "*  * \n" + "**** \n";

        char[] inputArray = input.toCharArray();
        int inputLength = input.toCharArray().length;
        String[] output = new String[inputLength];
        int count = inputLength - 1;
        for (char i:inputArray) {
            if (i == '1') {
                output [count] = one;
                count--;
            }
            if (i == '2') {
                output [count] = two;
                count--;
            }
            if (i == '3') {
                output [count] = three;
                count--;
            }
            if (i == '4') {
                output [count] = four;
                count--;
            }
            if (i == '5') {
                output [count] = five;
                count--;
            }
            if (i == '6') {
                output [count] = six;
                count--;
            }
            if (i == '7') {
                output [count] = seven;
                count--;
            }
            if (i == '8') {
                output [count] = eight;
                count--;
            }
            if (i == '9') {
                output [count] = nine;
                count--;
            }
            if (i == '0') {
                output [count] = zero;
                count--;
            }
        }
        //не помогло вывести в 1 строку
        String outputToString = String.join("", output);
        System.out.print(outputToString);

    }
}
