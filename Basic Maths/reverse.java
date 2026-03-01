public class reverse {

    public static int reverseNumber(int n){
        int revNum = 0;
        int temp = n;
        if(n < 0){
            n = n * (-1);
        }
        while(n>0){
            int curLastDigit = n%10;
            revNum = (revNum * 10) + curLastDigit ;
            n = n / 10;
        }
        if(temp < 0)
            return -revNum;
        else
            return revNum;
    }
    public static void main(String[] args) {
        //System.out.println(reverseNumber(-396));
        System.out.println(Integer.MAX_VALUE);
    }
}
