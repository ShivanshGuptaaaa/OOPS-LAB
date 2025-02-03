public class CI {
    public static void main(String[] args) {
        int P = 10000;
        double R = 0.1;
        int n = 4;
        int t = 2;
        double A = P * Math.pow(1 + R / n, (n * t));

        System.out.println(A);
    }
}
