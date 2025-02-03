public class pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.print("* ");
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
