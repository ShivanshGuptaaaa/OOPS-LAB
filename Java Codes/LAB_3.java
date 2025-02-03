import java.util.Scanner;

public class LAB_3 {
    public static void main(String[] args) {
        // int x[] = new int[5];
        // int y[][] = new int[3][5];
        // // System.out.println(y.length);
        // // System.out.println(y[0].length);
        // // System.out.println(y[5].length);
        // for (int i = 0; i < y.length; i++) {
        // for (int j = 0; j < y[i].length; j++) {
        // }
        // }
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 1000;
        int src = 2;
        int c[] = { 8, 2, 4, 1 };
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
            if (c[i] < min) {
                min = c[i];
            }
            if (c[i] == src) {
                System.out.println("FOUND " + src);
                int x[] = new int[c.length - i];
                for (int k = 0; k < x.length; k++) {
                    x[k] = c[i + k];
                    System.out.println(x[k]);
                }
            }
        }
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        int j = 0;
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr1[] = { 1, 2, 3, 4, 5 };
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr1[i]) {
                    j = 1;
                } else {
                    j = 0;
                }
            }
        } else {
            System.out.println("NOT SAME");
        }
        if (j == 0) {
            System.out.println("NOT SAME");
        } else {
            System.out.println("SAME");
        }
        int arr2[] = new int[5];
        int sum = 0;
        System.out.println("Enter the 0-100");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            if (arr[i] > 100) {
                System.out.println("Invalid");
                break;
            }
            sum = sum + arr2[i];
        }
        System.out.println(sum);
        if (sum > 400) {
            System.out.println("O");
        } else if (sum > 300) {
            System.out.println("E");
        } else if (sum > 250) {
            System.out.println("A");
        } else if (sum > 200) {
            System.out.println("B");
        } else if (sum < 200) {
            System.out.println("F");
        }
    }
}
