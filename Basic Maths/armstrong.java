public class armstrong {
    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 6;
        int temp = num;
        int sumOfDigits = 0;
        int numOfDigits = countDigits(num);

        while(num > 0){
            int ld = num % 10;
            sumOfDigits += Math.pow(ld, numOfDigits);
            num = num / 10;
        }
        System.out.println(sumOfDigits);
        System.out.println(sumOfDigits == temp);
    }
}
