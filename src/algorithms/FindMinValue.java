package algorithms;

public class FindMinValue {

    public static int findValue(int[] array) {
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Index of element: " + minIndex);
        return minValue;
    }
}
