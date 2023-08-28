public class CutEdedsayi {
    public static void main(String[] args) {
        //7.Array'in cüt elementlərinin sayını tapın
        int array[]={20, 24, 25, 37, 38, 400, 75, 15};
        int ededSayi=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0){
                ++ededSayi;

            }
        } System.out.println("cut ededlerin sayi: "+ededSayi);
    }
}
