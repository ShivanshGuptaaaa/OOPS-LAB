public class DIG {
    public static void main(String[] args) {
        int num =1548 ;
        int odd= 0;
        int even= 0;

        while (num > 0) {
            int rem = num % 10;
if(rem%2!=0){
            odd += rem;
}
else{
            even += rem;
}
            num /= 10;
        }

            System.out.println("odd"+odd);
            System.out.println("even"+even);
        
    }
}
