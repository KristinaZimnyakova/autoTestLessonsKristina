public class Lesson1task1d {

    static void task1d(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int[] array = new int[] {i, i1, i2, i3, i4, i5, i6, i7, i8, i9};
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max) {
                max = array[j];
            }
        }
        System.out.println("Максимальное значение " + max);
    }

}
