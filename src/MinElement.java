public class MinElement {
    public static void main(String[] args) {
        //5.Array'in minimum elementini tapın
        int array[]={11,20,25,26,28,7};
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];

            }
        } System.out.println("minimum: "+min);
    }
}
