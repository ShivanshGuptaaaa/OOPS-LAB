public class SER {
    public static void main(String[] args) {
        int N = 4;
        double sum = 0;
        for (int i = 0; i < N; i++) {

            sum = sum + 1 / Math.pow(2, i);

        }
        System.out.println(sum);

    }
}
