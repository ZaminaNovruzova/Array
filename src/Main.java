public class Main {
    public static void main(String[] args) {
       // 1.Ölçüsü 5 olan array yaradın. Arraydəki cüt ədədləri çapa verin
        int[] a = {10, 12, 11, 5, 4};
        System.out.println("even number:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

}
