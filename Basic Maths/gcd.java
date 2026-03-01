public class gcd {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 40;
        int gcd = 1;
        
        int num = Math.min(num1, num2);

        for(int i=1; i<=num; i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
