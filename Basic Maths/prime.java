public class prime {
    public static void main(String[] args) {
        int num = 16;
        int flag = 1;

        for(int i=2; i<= num/2; i++ ){
            if(num % i == 0){
                flag = 0;
            }
        }
        System.out.println(flag == 1);
    }
}
