public class OddIndex {
    public static void main(String[] args) {
       // 4.Ölçüsü 5 olan array yaradın. Yalnız tek indekslərdəki elementləri çap edin.
        int a[] = {10, 12, 13, 15, 16};
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0 && i != 0) {
                System.out.println(a[i]);
            }

        }
    }
}
