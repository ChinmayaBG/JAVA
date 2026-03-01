public class palindrome {
    public static int reverseNumber(int n){
        int revNum = 0;
        while(n>0){
            int curLastDigit = n%10;
            revNum = (revNum * 10) + curLastDigit ;
            n = n / 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int num = 9897;
        System.out.println(num == reverseNumber(num));
    }
}
