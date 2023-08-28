public class MaxElement {
    public static void main(String[] args) {
        //6.Array'in maksimum elementini tapın.
        int array[] = {20, 24, 25, 37, 38, 400, 75, 15};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }System.out.println("maximum: " + max);
    }
}
