public class OddNumber {
    public static void main(String[] args) {
        //2.Ölçüsü 5 olan array yaradın. Arraydəki tək ədədləri çapa verin
    int arr[]={1,7,4,8,11};
        System.out.println("odd number:");
        for (int i=0; i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
        }
        }

    }
}
