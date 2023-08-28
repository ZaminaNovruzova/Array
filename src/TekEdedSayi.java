public class TekEdedSayi {
    public static void main(String[] args) {
        //8.Array'in tək elementlərinin sayını tapın
        int a[]={20, 24, 37, 38, 400, 75};
        int ededSayi=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0&&a[i]!=0){
                ++ededSayi;
            }

        }
        System.out.println("tek ededlerin sayi: "+ededSayi);
    }
}
