public class DIG {
    public static void main(String[] args) {
        int num = 18;
        int ori = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        if (ori % sum == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
