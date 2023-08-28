public class EvenIndex {
    public static void main(String[] args) {
        //3.Ölçüsü 5 olan array yaradın. Yalnız cüt indekslərdəki elementləri çap edin
        int a[] = {1, 3, 5, 7, 10};
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
